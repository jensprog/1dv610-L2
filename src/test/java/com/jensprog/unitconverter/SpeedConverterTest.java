package com.jensprog.unitconverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SpeedConverterTest {
  @Test
  public void testKmhToMs() {
    SpeedConverter speedConverter = new SpeedConverter("km/h", "m/s");
    double input = 36;
    double expected = 10;
    assertEquals(expected, speedConverter.convert(input));

    input = 3.6;
    expected = 1;
    assertEquals(expected, speedConverter.convert(input));

    input = 72;
    expected = 20;
    assertEquals(expected, speedConverter.convert(input));
  }

  @Test
  public void testMsToKmh() {
    SpeedConverter speedConverter = new SpeedConverter("m/s", "km/h");
    double input = 10;
    double expected = 36;
    assertEquals(expected, speedConverter.convert(input));

    input = 1;
    expected = 3.6;
    assertEquals(expected, speedConverter.convert(input));

    input = 20;
    expected = 72;
    assertEquals(expected, speedConverter.convert(input));
  }

  @Test
  public void testMphToKmh() {
    SpeedConverter speedConverter = new SpeedConverter("mph", "km/h");
    double input = 1;
    double expected = 1.61;
    assertEquals(expected, speedConverter.convert(input));

    input = 60;
    expected = 96.56;
    assertEquals(expected, speedConverter.convert(input));

    input = 100;
    expected = 160.93;
    assertEquals(expected, speedConverter.convert(input));
  }

  @Test
  public void testKmhToMph() {
    SpeedConverter speedConverter = new SpeedConverter("km/h", "mph");
    double input = 1;
    double expected = 0.62;
    assertEquals(expected, speedConverter.convert(input));

    input = 100;
    expected = 62.14;
    assertEquals(expected, speedConverter.convert(input));

    input = 160.934;
    expected = 100;
    assertEquals(expected, speedConverter.convert(input));
  }

  @Test
  public void testMphToMs() {
    SpeedConverter speedConverter = new SpeedConverter("mph", "m/s");
    double input = 1;
    double expected = 0.45;
    assertEquals(expected, speedConverter.convert(input));

    input = 60;
    expected = 26.82;
    assertEquals(expected, speedConverter.convert(input));

    input = 100;
    expected = 44.70;
    assertEquals(expected, speedConverter.convert(input));
  }

  @Test
  public void testMsToMph() {
    SpeedConverter speedConverter = new SpeedConverter("m/s", "mph");
    double input = 1;
    double expected = 2.24;
    assertEquals(expected, speedConverter.convert(input));

    input = 10;
    expected = 22.37;
    assertEquals(expected, speedConverter.convert(input));

    input = 100;
    expected = 223.69;
    assertEquals(expected, speedConverter.convert(input));
  }
}
