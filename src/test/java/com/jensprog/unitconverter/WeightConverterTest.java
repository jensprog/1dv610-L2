package com.jensprog.unitconverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WeightConverterTest {
  @Test
  public void testKilogramToGramWithLowNumber() {
    WeightConverter weightConverter = new WeightConverter("kilogram", "gram");
    double input = 0.01;
    double expected = 10;
    assertEquals(expected, weightConverter.convert(input));
  }

  @Test
  public void testKilogramToGramWithNormalNumber() {
    WeightConverter weightConverter = new WeightConverter("kilogram", "gram");
    double input = 10;
    double expected = 10000;
    assertEquals(expected, weightConverter.convert(input));
  }

  @Test
  public void testKilogramToGramWithLargeNumber() {
    WeightConverter weightConverter = new WeightConverter("kilogram", "gram");
    double input = 250;
    double expected = 250000;
    assertEquals(expected, weightConverter.convert(input));
  }

  @Test
  public void testKilogramToPoundWithLowNumber() {
    WeightConverter weightConverter = new WeightConverter("kilogram", "pound");
    double input = 0.01;
    double expected = 0.02;
    assertEquals(expected, weightConverter.convert(input));
  }

  @Test
  public void testKilogramToPoundWithNormalNumber() {
    WeightConverter weightConverter = new WeightConverter("kilogram", "pound");
    double input = 10;
    double expected = 22.05;
    assertEquals(expected, weightConverter.convert(input));
  }

  @Test
  public void testKilogramToPoundWithLargeNumber() {
    WeightConverter weightConverter = new WeightConverter("kilogram", "pound");
    double input = 250;
    double expected = 551.16;
    assertEquals(expected, weightConverter.convert(input));
  }

  @Test
  public void testKilogramToKilogram() {
    WeightConverter weightConverter = new WeightConverter("kilogram", "kilogram");
    double input = 10;
    double expected = 10;
    assertEquals(expected, weightConverter.convert(input));
  }
}
