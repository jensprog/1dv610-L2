package com.jensprog.formatter;

public class UnitConversionQueryFormatter {
  private double originalValue;
  private String fromUnit;
  private double convertedValue;
  private String toUnit;

  public UnitConversionQueryFormatter(double originalValue, String fromUnit,
      double convertedValue, String toUnit) {
    this.originalValue = originalValue;
    this.fromUnit = fromUnit;
    this.convertedValue = convertedValue;
    this.toUnit = toUnit;
  }

  public String format() {
    return originalValue + " " + fromUnit + "s" + " is " + convertedValue + " " + toUnit + "s";
  }
}
