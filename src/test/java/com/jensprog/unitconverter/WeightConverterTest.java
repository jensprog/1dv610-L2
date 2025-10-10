package com.jensprog.unitconverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WeightConverterTest {
  @Test
  public void testKilogramToGram() {
    WeightConverter weightConverter = new WeightConverter("kilogram", "gram");
    double input = 1;
    double expected = 1000;
    assertEquals(expected, weightConverter.convert(input));

    input = 0.001;
    expected = 1;
    assertEquals(expected, weightConverter.convert(input));

    input = 1000;
    expected = 1000000;
    assertEquals(expected, weightConverter.convert(input));

  }

  @Test
  public void testKilogramToPound() {
    WeightConverter weightConverter = new WeightConverter("kilogram", "pound");
    double input = 10;
    double expected = 22.05;
    assertEquals(expected, weightConverter.convert(input));

    input = 250;
    expected = 551.16;
    assertEquals(expected, weightConverter.convert(input));

    input = 0.454;
    expected = 1;
    assertEquals(expected, weightConverter.convert(input));
  }

  @Test
  public void testKilogramToKilogram() {
    WeightConverter weightConverter = new WeightConverter("kilogram", "kilogram");
    double input = 10;
    double expected = 10;
    assertEquals(expected, weightConverter.convert(input));

    input = 250;
    expected = 250;
    assertEquals(expected, weightConverter.convert(input));

    input = 0.454;
    expected = 0.45;
    assertEquals(expected, weightConverter.convert(input));
  }
}
