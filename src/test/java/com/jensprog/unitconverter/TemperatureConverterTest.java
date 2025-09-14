package com.jensprog.unitconverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TemperatureConverterTest {
  @Test
  public void testCelciusToFahrenheit() {
    TemperatureConverter temperatureConverter = new TemperatureConverter("Celsius", "Fahrenheit");
    double input = 35;
    double expected = 95;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);

    input = 1000;
    expected = 1832;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);

    input = -2000;
    expected = -3568;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);
  }

  @Test
  public void testFahrenheitToCelsius() {
    TemperatureConverter temperatureConverter = new TemperatureConverter("Fahrenheit", "Celsius");
    double input = 0;
    double expected = -17.7778;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);

    input = -40;
    expected = -40;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);

    input = 212;
    expected = 100;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);
  }

  @Test
  public void testCelsiusToKelvin() {
    TemperatureConverter temperatureConverter = new TemperatureConverter("Celsius", "Kelvin");
    double input = 0;
    double expected = 273.15;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);

    input = -273.15;
    expected = 0;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);

    input = 100;
    expected = 373.15;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);
  }

  @Test
  public void testKelvinToCelsius() {
    TemperatureConverter temperatureConverter = new TemperatureConverter("Kelvin", "Celsius");
    double input = 0;
    double expected = -273.15;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);

    input = 273.15;
    expected = 0;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);

    input = 373.15;
    expected = 100;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);
  }

  @Test
  public void testFahrenheitToKelvin() {
    TemperatureConverter temperatureConverter = new TemperatureConverter("Fahrenheit", "Kelvin");
    double input = 32;
    double expected = 273.15;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);

    input = -459.67;
    expected = 0;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);

    input = 212;
    expected = 373.15;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);
  }

  @Test
  public void testKelvinToFahrenheit() {
    TemperatureConverter temperatureConverter = new TemperatureConverter("Kelvin", "Fahrenheit");
    double input = 273.15;
    double expected = 32;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);

    input = 0;
    expected = -459.67;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);

    input = 373.15;
    expected = 212;
    assertEquals(expected, temperatureConverter.convert(input), 0.0001);
  }
}
