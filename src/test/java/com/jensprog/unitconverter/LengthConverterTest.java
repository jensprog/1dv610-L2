package com.jensprog.unitconverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LengthConverterTest {
  @Test
  void testInchToKilometer() {
    LengthConverter lengthConverter = new LengthConverter("inch", "kilometer");
    double result = lengthConverter.convert(1);
    assertEquals(0.0000254, result, 0.000001);
  }
}
