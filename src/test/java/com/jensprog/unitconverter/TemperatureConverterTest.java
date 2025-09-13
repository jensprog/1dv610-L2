package com.jensprog.unitconverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.jensprog.unitconverter.TemperatureConverter;
import org.junit.jupiter.api.Test;

class TemperatureConverterTest {
  @Test
  void testCelciusToFahrenheit() {
    TemperatureConverter temperatureConverter = new TemperatureConverter("Celsius", "Fahrenheit");
    double result = temperatureConverter.convert(0);
    assertEquals(32, result, 0.01);
  }
}
