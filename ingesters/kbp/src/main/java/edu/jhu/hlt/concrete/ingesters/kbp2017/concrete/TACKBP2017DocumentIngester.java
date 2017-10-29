package edu.jhu.hlt.concrete.ingesters.kbp2017.concrete;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.beust.jcommander.JCommander;

import edu.jhu.hlt.acute.archivers.tar.TarArchiver;
import edu.jhu.hlt.concrete.Communication;
import edu.jhu.hlt.concrete.ingesters.base.IngestException;
import edu.jhu.hlt.concrete.ingesters.base.IngesterOpts;
import edu.jhu.hlt.concrete.ingesters.bolt.BoltForumPostIngester;
import edu.jhu.hlt.concrete.ingesters.webposts.TACKBP2017NewsWireIngester;
import edu.jhu.hlt.concrete.ingesters.webposts.TACKBP2017WebPostIngester;
import edu.jhu.hlt.concrete.serialization.archiver.ArchivableCommunication;
import edu.jhu.hlt.utilt.ex.LoggedUncaughtExceptionHandler;
import edu.jhu.hlt.utilt.io.ExistingNonDirectoryFile;
import edu.jhu.hlt.utilt.io.NotFileException;

public class TACKBP2017DocumentIngester {

  private static final Logger LOGGER = LoggerFactory.getLogger(TACKBP2017DocumentIngester.class);

  public static void main(String... args) {
    Thread.setDefaultUncaughtExceptionHandler(new LoggedUncaughtExceptionHandler());
    TACKBP2017Opts run = new TACKBP2017Opts();
    JCommander jc = JCommander.newBuilder().addObject(run).build();
    jc.parse(args);
    jc.setProgramName(TACKBP2017DocumentIngester.class.getSimpleName());
    if (run.delegate.help) {
      jc.usage();
      return;
    }

    try {
      if (!run.validate()) {
        System.out.println("Input is not a LDC2017E25/data/lang directory");
        System.exit(2);
      }
      LOGGER.info("Path is OK");

      run.delegate.prepare();
      Path outpath = run.delegate.outputPath;

      // this is for NYT_ docs
      TACKBP2017NewsWireIngester ing = new TACKBP2017NewsWireIngester();
      // TODO this needs fixing
      // this is for other newswire docs
      TACKBP2017WebPostIngester otherING = new TACKBP2017WebPostIngester();
      // discussion forum ingester
      BoltForumPostIngester dfIngester = new BoltForumPostIngester();

      try (OutputStream os = Files.newOutputStream(outpath);
          BufferedOutputStream bout = new BufferedOutputStream(os);
          GzipCompressorOutputStream gout = new GzipCompressorOutputStream(bout);
          TarArchiver arch = new TarArchiver(gout)) {
        Path nwp = run.getNewswirePath();
        LOGGER.info("Running over newswire: {}", nwp.toString());
        for (Path p : IngesterOpts.findFiles(nwp)) {
          LOGGER.debug("Running on file: {}", p.toString());
          String fn = new ExistingNonDirectoryFile(p).getName();
          try {
            Communication next;
            if (fn.startsWith("NYT_"))
              next = ing.fromCharacterBasedFile(p);
            else
              next = otherING.fromCharacterBasedFile(p);
            arch.addEntry(new ArchivableCommunication(next));
          } catch (IngestException e) {
            LOGGER.error("Error processing file: " + p.toString(), e);
          }
        }

        Path dfp = run.getDiscussionForumPath();
        LOGGER.info("Running over discussion forum posts: {}", dfp.toString());
        for (Path p : IngesterOpts.findFiles(dfp)) {
          LOGGER.debug("Running on file: {}", p);
          new ExistingNonDirectoryFile(p);
          try {
            Communication next = dfIngester.fromCharacterBasedFile(p);
            arch.addEntry(new ArchivableCommunication(next));
          } catch (IngestException e) {
            LOGGER.error("Error processing file: " + p.toString(), e);
          }
        }
      }
    } catch (NotFileException | IOException e) {
      LOGGER.error("Caught exception processing.", e);
    }
  }
}