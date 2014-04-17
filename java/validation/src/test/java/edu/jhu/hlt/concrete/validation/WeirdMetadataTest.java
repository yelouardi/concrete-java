/*
 * 
 */
package edu.jhu.hlt.concrete.validation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.jhu.hlt.concrete.AnnotationMetadata;

/**
 * @author max
 *
 */
public class WeirdMetadataTest {

  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {
  }

  /**
   * @throws java.lang.Exception
   */
  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void test() {
    AnnotationMetadata md = new AnnotationMetadata();
    md.confidence = 1f;
    System.out.println(md.toString());
    md.setConfidence(1F);
    System.out.println(md.toString());
    md.tool = "Test";
    System.out.println(md.toString());
  }

}
