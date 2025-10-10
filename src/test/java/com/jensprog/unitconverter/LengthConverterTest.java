package com.jensprog.unitconverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LengthConverterTest {
  @Test
  public void testMeterToMillimeter() {
    LengthConverter lengthConverter = new LengthConverter("meter", "millimeter");
    double input = 1;
    double expected = 1000;
    assertEquals(expected, lengthConverter.convert(input));

    input = 0.001;
    expected = 1;
    assertEquals(expected, lengthConverter.convert(input));

    input = 1000;
    expected = 1000000;
    assertEquals(expected, lengthConverter.convert(input));
  }

  @Test
  public void testMillimeterToMeter() {
    LengthConverter lengthConverter = new LengthConverter("millimeter", "meter");
    double input = 1000;
    double expected = 1;
    assertEquals(expected, lengthConverter.convert(input));

    input = 1000000;
    expected = 1000;
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
  public void testKilometerToInch() {
    LengthConverter lengthConverter = new LengthConverter("kilometer", "inch");
    double input = 1;
    double expected = 39370.08;
    assertEquals(expected, lengthConverter.convert(input));

    input = 0.0254;
    expected = 1000;
    assertEquals(expected, lengthConverter.convert(input));

    input = 254;
    expected = 10000000;
    assertEquals(expected, lengthConverter.convert(input));
  }

  @Test
  public void testCentimeterToMillimeter() {
    LengthConverter lengthConverter = new LengthConverter("centimeter", "millimeter");
    double input = 10;
    double expected = 100;
    assertEquals(expected, lengthConverter.convert(input));

    input = 10000;
    expected = 100000;
    assertEquals(expected, lengthConverter.convert(input));

    input = 0;
    expected = 0;
    assertEquals(expected, lengthConverter.convert(input));
    
  }

  @Test
  public void testMillimeterToCentimeter() {
    LengthConverter lengthConverter = new LengthConverter("millimeter", "centimeter");
    double input = 100;
    double expected = 10;
    assertEquals(expected, lengthConverter.convert(input));

    input = 100000;
    expected = 10000;
    assertEquals(expected, lengthConverter.convert(input));

    input = 0;
    expected = 0;
    assertEquals(expected, lengthConverter.convert(input));

  }

  @Test
  public void testMeterToCentimeter() {
    LengthConverter lengthConverter = new LengthConverter("meter", "centimeter");
    double input = 1;
    double expected = 100;
    assertEquals(expected, lengthConverter.convert(input));

    input = 0.01;
    expected = 1;
    assertEquals(expected, lengthConverter.convert(input));

    input = 1000;
    expected = 100000;
    assertEquals(expected, lengthConverter.convert(input));
  }

  @Test
  public void testCentimeterToMeter() {
    LengthConverter lengthConverter = new LengthConverter("centimeter", "meter");
    double input = 100;
    double expected = 1;
    assertEquals(expected, lengthConverter.convert(input));

    input = 1;
    expected = 0.01;
    assertEquals(expected, lengthConverter.convert(input));

    input = 100000;
    expected = 1000;
    assertEquals(expected, lengthConverter.convert(input));
  }

  @Test
  public void testMeterToMeter() {
    LengthConverter lengthConverter = new LengthConverter("meter", "meter");
    double input = 1;
    double expected = 1;
    assertEquals(expected, lengthConverter.convert(input));

    input = 0.01;
    expected = 0.01;
    assertEquals(expected, lengthConverter.convert(input));

    input = 1000;
    expected = 1000;
    assertEquals(expected, lengthConverter.convert(input));
  }
}
