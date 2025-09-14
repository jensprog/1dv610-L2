package com.jensprog.unitconverter;

/**
 * A utility class for converting temperature values between Celsius, Fahrenheit and Kelvin.
 */
public class TemperatureConverter {
  private String fromUnit;
  private String toUnit;

  public TemperatureConverter(String fromUnit, String toUnit) {
    this.fromUnit = fromUnit;
    this.toUnit = toUnit;
  }

  public String getFromUnit() {
    return fromUnit;
  }

  public String getToUnit() {
    return toUnit;
  }


  public void setFromUnit(String fromUnit) {
    if (fromUnit == null || fromUnit.isEmpty()) {
      throw new IllegalArgumentException("fromUnit cannot be null or empty");
    }
    this.fromUnit = fromUnit;
  }

 
  public void setToUnit(String toUnit) {
    if (toUnit == null || toUnit.isEmpty()) {
      throw new IllegalArgumentException("toUnit cannot be null or empty");
    }
    this.toUnit = toUnit;
  }

 
  public double convert(double value) {
    if (fromUnit.equalsIgnoreCase("Celsius") && toUnit.equalsIgnoreCase("Fahrenheit")) {
      return (value * 9 / 5) + 32;
    } else if (fromUnit.equalsIgnoreCase("Fahrenheit") && toUnit.equalsIgnoreCase("Celsius")) {
      return (value - 32) * 5 / 9;
    } else if (fromUnit.equalsIgnoreCase("Celsius") && toUnit.equalsIgnoreCase("Kelvin")) {
      return value + 273.15;
    } else if (fromUnit.equalsIgnoreCase("Kelvin") && toUnit.equalsIgnoreCase("Celsius")) {
      return value - 273.15;
    } else if (fromUnit.equalsIgnoreCase("Fahrenheit") && toUnit.equalsIgnoreCase("Kelvin")) {
      return (value - 32) * 5 / 9 + 273.15;
    } else if (fromUnit.equalsIgnoreCase("Kelvin") && toUnit.equalsIgnoreCase("Fahrenheit")) {
      return (value - 273.15) * 9 / 5 + 32;
    } else {
      throw new IllegalArgumentException("Cannot convert from " + fromUnit + " to " + toUnit);
    }
  }
}
