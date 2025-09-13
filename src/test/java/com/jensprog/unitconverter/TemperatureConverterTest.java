package com.jensprog.unitconverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TemperatureConverterTest {
  @Test
  void testCelciusToFahrenheit() {
    TemperatureConverter temperatureConverter = new TemperatureConverter("Celsius", "Fahrenheit");
    double result = temperatureConverter.convert(0);
    assertEquals(32, result, 0.01);
  }

  @Test
  void testFahrenheitToCelsius() {
    TemperatureConverter temperatureConverter = new TemperatureConverter("Fahrenheit", "Celsius");
    double result = temperatureConverter.convert(32);
    assertEquals(0, result, 0.01);
  }
}
