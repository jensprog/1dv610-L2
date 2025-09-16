package com.jensprog.unitconverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SpeedConverterTest {
  @Test
  public void testKmhToMs() {
    SpeedConverter speedConverter = new SpeedConverter("km/h", "m/s");
    double input = 36;
    double expected = 10;
    assertEquals(expected, speedConverter.convert(input), 0.01);

    input = 3.6;
    expected = 1;
    assertEquals(expected, speedConverter.convert(input), 0.01);

    input = 72;
    expected = 20;
    assertEquals(expected, speedConverter.convert(input), 0.01);
  }

  @Test
  public void testMsToKmh() {
    SpeedConverter speedConverter = new SpeedConverter("m/s", "km/h");
    double input = 10;
    double expected = 36;
    assertEquals(expected, speedConverter.convert(input), 0.01);

    input = 1;
    expected = 3.6;
    assertEquals(expected, speedConverter.convert(input), 0.01);

    input = 20;
    expected = 72;
    assertEquals(expected, speedConverter.convert(input), 0.01);
  }

  @Test
  public void testMphToKmh() {
    SpeedConverter speedConverter = new SpeedConverter("mph", "km/h");
    double input = 1;
    double expected = 1.60934;
    assertEquals(expected, speedConverter.convert(input), 0.01);

    input = 60;
    expected = 96.5604;
    assertEquals(expected, speedConverter.convert(input), 0.01);

    input = 100;
    expected = 160.934;
    assertEquals(expected, speedConverter.convert(input), 0.01);
  }

  @Test
  public void testKmhToMph() {
    SpeedConverter speedConverter = new SpeedConverter("km/h", "mph");
    double input = 1;
    double expected = 0.621371;
    assertEquals(expected, speedConverter.convert(input), 0.01);

    input = 100;
    expected = 62.1371;
    assertEquals(expected, speedConverter.convert(input), 0.01);

    input = 160.934;
    expected = 100;
    assertEquals(expected, speedConverter.convert(input), 0.01);
  }

  @Test
  public void testMphToMs() {
    SpeedConverter speedConverter = new SpeedConverter("mph", "m/s");
    double input = 1;
    double expected = 0.44704;
    assertEquals(expected, speedConverter.convert(input), 0.01);

    input = 60;
    expected = 26.8224;
    assertEquals(expected, speedConverter.convert(input), 0.01);

    input = 100;
    expected = 44.704;
    assertEquals(expected, speedConverter.convert(input), 0.01);
  }

  @Test
  public void testMsToMph() {
    SpeedConverter speedConverter = new SpeedConverter("m/s", "mph");
    double input = 1;
    double expected = 2.23694;
    assertEquals(expected, speedConverter.convert(input), 0.01);

    input = 10;
    expected = 22.3694;
    assertEquals(expected, speedConverter.convert(input), 0.01);

    input = 100;
    expected = 223.694;
    assertEquals(expected, speedConverter.convert(input), 0.01);
  }
}
