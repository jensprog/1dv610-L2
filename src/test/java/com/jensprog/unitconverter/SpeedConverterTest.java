package com.jensprog.unitconverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SpeedConverterTest {
  @Test
  public void testKmhToMsWithNormalNumber() {
    SpeedConverter speedConverter = new SpeedConverter("km/h", "m/s");
    double input = 36;
    double expected = 10;
    assertEquals(expected, speedConverter.convert(input));
  }

  @Test
  public void testKmhToMsWithLowNumber() {
    SpeedConverter speedConverter = new SpeedConverter("km/h", "m/s");
    double input = 3.6;
    double expected = 1;
    assertEquals(expected, speedConverter.convert(input));
  }

  @Test
  public void testKmhToMsWithLargeNumber() {
    SpeedConverter speedConverter = new SpeedConverter("km/h", "m/s");
    double input = 1000;
    double expected = 277.78;
    assertEquals(expected, speedConverter.convert(input));
  }

  @Test
  public void testMsToKmhWithNormalNumber() {
    SpeedConverter speedConverter = new SpeedConverter("m/s", "km/h");
    double input = 10;
    double expected = 36;
    assertEquals(expected, speedConverter.convert(input));
  }

  @Test
  public void testMsToKmhWithLowNumber() {
    SpeedConverter speedConverter = new SpeedConverter("m/s", "km/h");
    double input = 1;
    double expected = 3.6;
    assertEquals(expected, speedConverter.convert(input));
  }

  @Test
  public void testMsToKmhWithLargeNumber() {
    SpeedConverter speedConverter = new SpeedConverter("m/s", "km/h");
    double input = 300;
    double expected = 1080;
    assertEquals(expected, speedConverter.convert(input));
  }

  @Test
  public void testMphToKmhWithLowNumber() {
    SpeedConverter speedConverter = new SpeedConverter("mph", "km/h");
    double input = 1;
    double expected = 1.61;
    assertEquals(expected, speedConverter.convert(input));
  }

  @Test
  public void testMphToKmhWithNormalNumber() {
    SpeedConverter speedConverter = new SpeedConverter("mph", "km/h");
    double input = 60;
    double expected = 96.56;
    assertEquals(expected, speedConverter.convert(input));
  }

  @Test
  public void testMphToKmhWithLargeNumber() {
    SpeedConverter speedConverter = new SpeedConverter("mph", "km/h");
    double input = 1000;
    double expected = 1609.34;
    assertEquals(expected, speedConverter.convert(input));
  }

  @Test
  public void testKmhToMphWithLowNumber() {
    SpeedConverter speedConverter = new SpeedConverter("km/h", "mph");
    double input = 1;
    double expected = 0.62;
    assertEquals(expected, speedConverter.convert(input));
  }

  @Test
  public void testKmhToMphWithNormalNumber() {
    SpeedConverter speedConverter = new SpeedConverter("km/h", "mph");
    double input = 100;
    double expected = 62.14;
    assertEquals(expected, speedConverter.convert(input));
  }

  @Test
  public void testKmhToMphWithLargeNumber() {
    SpeedConverter speedConverter = new SpeedConverter("km/h", "mph");
    double input = 1000;
    double expected = 621.37;
    assertEquals(expected, speedConverter.convert(input));
  }

  @Test
  public void testMphToMsWithLowNumber() {
    SpeedConverter speedConverter = new SpeedConverter("mph", "m/s");
    double input = 1;
    double expected = 0.45;
    assertEquals(expected, speedConverter.convert(input));
  }

  @Test
  public void testMphToMsWithNormalNumber() {
    SpeedConverter speedConverter = new SpeedConverter("mph", "m/s");
    double input = 60;
    double expected = 26.82;
    assertEquals(expected, speedConverter.convert(input));
  }

  @Test
  public void testMphToMsWithLargeNumber() {
    SpeedConverter speedConverter = new SpeedConverter("mph", "m/s");
    double input = 1000;
    double expected = 447.04;
    assertEquals(expected, speedConverter.convert(input));
  }

  @Test
  public void testMsToMphWithLowNumber() {
    SpeedConverter speedConverter = new SpeedConverter("m/s", "mph");
    double input = 1;
    double expected = 2.24;
    assertEquals(expected, speedConverter.convert(input));
  }

  @Test
  public void testMsToMphwithNormalNumber() {
    SpeedConverter speedConverter = new SpeedConverter("m/s", "mph");
    double input = 30;
    double expected = 67.11;
    assertEquals(expected, speedConverter.convert(input));
  }

  @Test
  public void testMsToMphWithLargeNumber() {
    SpeedConverter speedConverter = new SpeedConverter("m/s", "mph");
    double input = 250;
    double expected = 559.23;
    assertEquals(expected, speedConverter.convert(input));
  }
}
