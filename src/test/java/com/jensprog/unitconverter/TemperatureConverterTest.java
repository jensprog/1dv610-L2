package com.jensprog.unitconverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TemperatureConverterTest {
  @Test
  public void testCelsiusToFahrenheitWithNegativeNumber() {
    TemperatureConverter temperatureConverter = new TemperatureConverter("Celsius", "Fahrenheit");
    double input = -50;
    double expected = -58;
    assertEquals(expected, temperatureConverter.convert(input));
  }

  @Test
  public void testCelsiusToFahrenheitWithLowPositiveNumber() {
    TemperatureConverter temperatureConverter = new TemperatureConverter("Celsius", "Fahrenheit");
    double input = 10;
    double expected = 50;
    assertEquals(expected, temperatureConverter.convert(input));
  }

  @Test
  public void testCelsiusToFahrenheitWithLargeNumber() {
    TemperatureConverter temperatureConverter = new TemperatureConverter("Celsius", "Fahrenheit");
    double input = 1000;
    double expected = 1832;
    assertEquals(expected, temperatureConverter.convert(input));
  }

  @Test
  public void testFahrenheitToCelsiusWithNegativeNumber() {
    TemperatureConverter temperatureConverter = new TemperatureConverter("Fahrenheit", "Celsius");
    double input = -80;
    double expected = -62.2222;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);
  }

  @Test
  public void testFahrenheitToCelsiusWithPositiveNumber() {
    TemperatureConverter temperatureConverter = new TemperatureConverter("Fahrenheit", "Celsius");
    double input = 50;
    double expected = 10;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);
  }

  @Test
  public void testFahrenheitToCelsiusWithLargeNumber() {
    TemperatureConverter temperatureConverter = new TemperatureConverter("Fahrenheit", "Celsius");
    double input = 1000;
    double expected = 537.7778;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);
  }

  @Test
  public void testCelsiusToKelvinWithZeroInput() {
    TemperatureConverter temperatureConverter = new TemperatureConverter("Celsius", "Kelvin");
    double input = 0;
    double expected = 273.15;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);
  }

  @Test
  public void testCelsiusToKelvinWithNegativeNumber() {
    TemperatureConverter temperatureConverter = new TemperatureConverter("Celsius", "Kelvin");
    double input = -100;
    double expected = 173.15;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);
  }

  @Test
  public void testCelsiusToKelvinWithLargeNumber() {
    TemperatureConverter temperatureConverter = new TemperatureConverter("Celsius", "Kelvin");
    double input = 1000;
    double expected = 1273.15;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);
  }

  @Test
  public void testKelvinToCelsiusWithZeroInput() {
    TemperatureConverter temperatureConverter = new TemperatureConverter("Kelvin", "Celsius");
    double input = 0;
    double expected = -273.15;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);
  }

  @Test
  public void testKelvinToCelsiusWithLowNumber() {
    TemperatureConverter temperatureConverter = new TemperatureConverter("Kelvin", "Celsius");
    double input = 20;
    double expected = -253.15;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);
  }

  @Test
  public void testKelvinToCelsiusWithLargeNumber() {
    TemperatureConverter temperatureConverter = new TemperatureConverter("Kelvin", "Celsius");
    double input = 1000;
    double expected = 726.85;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);
  }

  @Test
  public void testFahrenheitToKelvinWithNegativeNumber() {
    TemperatureConverter temperatureConverter = new TemperatureConverter("Fahrenheit", "Kelvin");
    double input = -40;
    double expected = 233.15;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);
  }

  @Test
  public void testFahrenheitToKelvinWithLowPositiveNumber() {
    TemperatureConverter temperatureConverter = new TemperatureConverter("Fahrenheit", "Kelvin");
    double input = 32;
    double expected = 273.15;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);
  }

  @Test
  public void testFahrenheitToKelvinWithLargeNumber() {
    TemperatureConverter temperatureConverter = new TemperatureConverter("Fahrenheit", "Kelvin");
    double input = 1000;
    double expected = 810.9278;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);
  }

  @Test
  public void testKelvinToFahrenheitWithNegativeNumber() {
    TemperatureConverter temperatureConverter = new TemperatureConverter("Kelvin", "Fahrenheit");
    double input = -100;
    double expected = -639.67;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);
  }

  @Test
  public void testKelvinToFahrenheitWithPositiveNumber() {
    TemperatureConverter temperatureConverter = new TemperatureConverter("Kelvin", "Fahrenheit");
    double input = 300;
    double expected = 80.33;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);
  }

  @Test
  public void testKelvinToFahrenheitWithLargeNumber() {
    TemperatureConverter temperatureConverter = new TemperatureConverter("Kelvin", "Fahrenheit");
    double input = 1000;
    double expected = 1340.33;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);
  }
}
