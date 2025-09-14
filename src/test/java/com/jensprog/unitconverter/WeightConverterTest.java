package com.jensprog.unitconverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WeightConverterTest {
  @Test
  public void testKilogramToGram() {
    WeightConverter weightConverter = new WeightConverter("kilogram", "gram");
    double input = 1;
    double expected = 1000;
    assertEquals(expected, weightConverter.convert(input), 0.0001);

    input = 0.001;
    expected = 1;
    assertEquals(expected, weightConverter.convert(input), 0.0001);

    input = 1000;
    expected = 1000000;
    assertEquals(expected, weightConverter.convert(input), 0.0001);

  }
}
