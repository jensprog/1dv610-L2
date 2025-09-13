package com.jensprog.unitconverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LengthConverterTest {
  @Test
  public void testInchToKilometer() {
    LengthConverter lengthConverter = new LengthConverter("inch", "kilometer");
    double input = 1;
    double expected = 0.0000254;
    assertEquals(expected, lengthConverter.convert(input), 0.0000001);

    input = 1000;
    expected = 0.0254;
    assertEquals(expected, lengthConverter.convert(input), 0.0000001);

    input = 10000000;
    expected = 254;
    assertEquals(expected, lengthConverter.convert(input), 0.0001);
  }

  @Test
  public void testCentimeterToMillimeter() {
    LengthConverter lengthConverter = new LengthConverter("centimeter", "millimeter");
    double input = 10;
    double expected = 100;
    assertEquals(expected, lengthConverter.convert(input), 0.0001);

    input = 10000;
    expected = 100000;
    assertEquals(expected, lengthConverter.convert(input), 0.0001);

    input = 0;
    expected = 0;
    assertEquals(expected, lengthConverter.convert(input), 0.0001);
    
  }
}
