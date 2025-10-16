package com.jensprog.unitconverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LengthConverterTest {
  @Test
  public void testMeterToMillimeterWithOneMeter() {
    LengthConverter lengthConverter = new LengthConverter("meter", "millimeter");
    double input = 1;
    double expected = 1000;
    assertEquals(expected, lengthConverter.convert(input));
  }

  @Test
  public void testMeterToMillimeterWithLowNumber() {
    LengthConverter lengthConverter = new LengthConverter("meter", "millimeter");
    double input = 0.001;
    double expected = 1;
    assertEquals(expected, lengthConverter.convert(input));
  }

  @Test
  public void testMeterToMillimeterWithLargeNumber() {
    LengthConverter lengthConverter = new LengthConverter("meter", "millimeter");
    double input = 1000;
    double expected = 1000000;
    assertEquals(expected, lengthConverter.convert(input));
  }

  @Test
  public void testMillimeterToMeterWithLowOutput() {
    LengthConverter lengthConverter = new LengthConverter("millimeter", "meter");
    double input = 10;
    double expected = 0.01;
    assertEquals(expected, lengthConverter.convert(input));
  }

  @Test
   public void testMillimeterToMeterWithLargeNumber() {
    LengthConverter lengthConverter = new LengthConverter("millimeter", "meter");
    double input = 1000000;
    double expected = 1000;
    assertEquals(expected, lengthConverter.convert(input));
  }

  @Test
  public void testInchToKilometer() {
    LengthConverter lengthConverter = new LengthConverter("inch", "kilometer");
    double input = 10000000;
    double expected = 254;
    assertEquals(expected, lengthConverter.convert(input));
  }

  @Test
  public void testKilometerToInchWithLargeNumber() {
    LengthConverter lengthConverter = new LengthConverter("kilometer", "inch");
    double input = 1;
    double expected = 39370.08;
    assertEquals(expected, lengthConverter.convert(input));
  }

  @Test
  public void testKilometerToInchWithLowInput() {
    LengthConverter lengthConverter = new LengthConverter("kilometer", "inch");
    double input = 0.0254;
    double expected = 1000;
    assertEquals(expected, lengthConverter.convert(input));
  }

  @Test
  public void testKilometerToInchWithZeroInput() {
    LengthConverter lengthConverter = new LengthConverter("kilometer", "inch");
    double input = 0;
    double expected = 0;
    assertEquals(expected, lengthConverter.convert(input));
  }

  @Test
  public void testCentimeterToMillimeterWithLowInput() {
    LengthConverter lengthConverter = new LengthConverter("centimeter", "millimeter");
    double input = 1;
    double expected = 10;
    assertEquals(expected, lengthConverter.convert(input));
  }

  @Test
  public void testCentimeterToMillimeterWithLargeNumber() {
    LengthConverter lengthConverter = new LengthConverter("centimeter", "millimeter");
    double input = 100000;
    double expected = 1000000;
    assertEquals(expected, lengthConverter.convert(input));
  }

  @Test
  public void testCentimeterToMillimeterWithZeroInput() {
    LengthConverter lengthConverter = new LengthConverter("centimeter", "millimeter");
    double input = 0;
    double expected = 0;
    assertEquals(expected, lengthConverter.convert(input));
  }

  @Test
  public void testMillimeterToCentimeterWithLowInput() {
    LengthConverter lengthConverter = new LengthConverter("millimeter", "centimeter");
    double input = 100;
    double expected = 10;
    assertEquals(expected, lengthConverter.convert(input));
  }

  @Test
  public void testMillimeterToCentimeterWithLargeNumber() {
    LengthConverter lengthConverter = new LengthConverter("millimeter", "centimeter");
    double input = 1000000;
    double expected = 100000;
    assertEquals(expected, lengthConverter.convert(input));
  }

  @Test
  public void testMillimeterToCentimeterWithZeroInput() {
    LengthConverter lengthConverter = new LengthConverter("millimeter", "centimeter");
    double input = 0;
    double expected = 0;
    assertEquals(expected, lengthConverter.convert(input));
  }

  @Test
  public void testMeterToCentimeterWithOneMeter() {
    LengthConverter lengthConverter = new LengthConverter("meter", "centimeter");
    double input = 1;
    double expected = 100;
    assertEquals(expected, lengthConverter.convert(input));
  }

  @Test
  public void testMeterToCentimeterWithLowInput() {
    LengthConverter lengthConverter = new LengthConverter("meter", "centimeter");
    double input = 0.01;
    double expected = 1;
    assertEquals(expected, lengthConverter.convert(input));
  }

  @Test
  public void testMeterToCentimeterWithLargeNumber() {
    LengthConverter lengthConverter = new LengthConverter("meter", "centimeter");
    double input = 1000;
    double expected = 100000;
    assertEquals(expected, lengthConverter.convert(input));
  }

  @Test
  public void testCentimeterToMeterWithNormalInput() {
    LengthConverter lengthConverter = new LengthConverter("centimeter", "meter");
    double input = 100;
    double expected = 1;
    assertEquals(expected, lengthConverter.convert(input));
  }

  @Test
  public void testCentimeterToMeterWithLowInput() {
    LengthConverter lengthConverter = new LengthConverter("centimeter", "meter");
    double input = 1;
    double expected = 0.01;
    assertEquals(expected, lengthConverter.convert(input));
  }

  @Test
  public void testCentimeterToMeterWithLargeNumber() {
    LengthConverter lengthConverter = new LengthConverter("centimeter", "meter");
    double input = 100000;
    double expected = 1000;
    assertEquals(expected, lengthConverter.convert(input));
  }

  @Test
  public void testMeterToMeterWithEqualNumber() {
    LengthConverter lengthConverter = new LengthConverter("meter", "meter");
    double input = 1;
    double expected = 1;
    assertEquals(expected, lengthConverter.convert(input));
  }
}
