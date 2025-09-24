package com.jensprog.unitconverter;

/**
 * Converts speed values between different units.
 */
public class SpeedConverter {
  private String fromUnit;
  private String toUnit;

  public SpeedConverter(String fromUnit, String toUnit) {
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
    if (fromUnit.equals("km/h") && toUnit.equals("m/s")) {
      return value / 3.6;
    } else if (fromUnit.equals("m/s") && toUnit.equals("km/h")) {
      return value * 3.6;
    } else if (fromUnit.equals("mph") && toUnit.equals("km/h")) {
      return value * 1.60934;
    } else if (fromUnit.equals("km/h") && toUnit.equals("mph")) {
      return value / 1.60934;
    } else if (fromUnit.equals("mph") && toUnit.equals("m/s")) {
      return value * 0.44704;
    } else if (fromUnit.equals("m/s") && toUnit.equals("mph")) {
      return value / 0.44704;
    } else {
      throw new IllegalArgumentException("Cannot convert from " + fromUnit + " to " + toUnit);
    }
  }
}
