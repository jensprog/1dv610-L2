package com.jensprog.data;

public class ConversionRequest {
  private final double value;
  private final String fromUnit;
  private final String toUnit;

  public ConversionRequest(double value, String fromUnit, String toUnit) {
    this.value = value;
    this.fromUnit = fromUnit;
    this.toUnit = toUnit;
  }

  public double getValue() {
    { return value; }
  }

  public String getFromUnit() {
    { return fromUnit; }
  }

  public String getToUnit() {
    { return toUnit; }
  }
}
