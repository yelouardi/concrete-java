/*
 * Copyright 2012-2015 Johns Hopkins University HLTCOE. All rights reserved.
 * See LICENSE in the project root directory.
 */
package edu.jhu.hlt.concrete.serialization.iterators;

import java.io.IOException;
import java.io.InputStream;

import edu.jhu.hlt.acute.iterators.tar.TarArchiveEntryByteIterator;
import edu.jhu.hlt.concrete.Communication;
import edu.jhu.hlt.concrete.serialization.CommunicationSerializer;
import edu.jhu.hlt.concrete.serialization.CompactCommunicationSerializer;
import edu.jhu.hlt.concrete.util.ConcreteException;
import edu.jhu.hlt.utilt.AutoCloseableIterator;
/**
 *
 */
public class TarArchiveEntryCommunicationIterator implements AutoCloseableIterator<Communication> {

  private final TarArchiveEntryByteIterator byteIter;
  protected final CommunicationSerializer cs = new CompactCommunicationSerializer();

  /**
   * @param is
   * @throws IOException
   */
  public TarArchiveEntryCommunicationIterator(InputStream is) throws IOException {
    this.byteIter = new TarArchiveEntryByteIterator(is);
  }

  /* (non-Javadoc)
   * @see java.util.Iterator#hasNext()
   */
  @Override
  public boolean hasNext() {
    return this.byteIter.hasNext();
  }

  /* (non-Javadoc)
   * @see java.util.Iterator#next()
   */
  @Override
  public Communication next() {
    byte[] n = this.byteIter.next();
    try {
      return this.cs.fromBytes(n);
    } catch (ConcreteException e) {
      throw new RuntimeException(e);
    }
  }

  /* (non-Javadoc)
   * @see java.util.Iterator#remove()
   */
  @Override
  public void remove() {
    throw new UnsupportedOperationException("You can't remove with this iterator.");
  }

  @Override
  public void close() throws Exception {
    this.byteIter.close();
  }
}
