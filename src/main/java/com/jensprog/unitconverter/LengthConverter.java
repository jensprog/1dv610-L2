package com.jensprog.unitconverter;

import java.util.HashMap;

/**
 * A utility class for converting length values.
 * Units are converted through meters as a base unit.
 */
public class LengthConverter {
  private String fromUnit;
  private String toUnit;

  private static final HashMap<String, Double> toMeters = new HashMap<>();

  static {
    toMeters.put("meter", 1.0);
    toMeters.put("millimeter", 0.001);
    toMeters.put("centimeter", 0.01);
    toMeters.put("decimeter", 0.1);
    toMeters.put("kilometer", 1000.0);
    toMeters.put("inch", 0.0254);
    toMeters.put("foot", 0.3048);
    toMeters.put("yard", 0.9144);
    toMeters.put("mile", 1609.34);
    toMeters.put("nautical mile", 1852.0);
  }

  public LengthConverter(String fromUnit, String toUnit) {
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
    try {
      double fromFactor = toMeters.get(fromUnit);
      double toFactor = toMeters.get(toUnit);

      return value * fromFactor / toFactor;
    } catch (Exception e) {
      throw new IllegalArgumentException("Cannot convert from " + fromUnit + " to " + toUnit);
    }
  }
}
