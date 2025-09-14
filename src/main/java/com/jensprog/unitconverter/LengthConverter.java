package com.jensprog.unitconverter;

import java.util.Map;

/**
 * A utility class for converting length values.
 * Units are converted through meters as a base unit.
 */
public class LengthConverter {
  private String fromUnit;
  private String toUnit;
  
  private static final Map<String, Double> TO_METERS = Map.of(
      "meter", 1.0,
      "millimeter", 0.001,
      "centimeter", 0.01,
      "decimeter", 0.1,
      "kilometer", 1000.0,
      "inch", 0.0254,
      "foot", 0.3048,
      "yard", 0.9144,
      "mile", 1609.34,
      "nautical mile", 1852.0);

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
      double fromFactor = TO_METERS.get(fromUnit);
      double toFactor = TO_METERS.get(toUnit);

      return value * fromFactor / toFactor;
    } catch (Exception e) {
      throw new IllegalArgumentException("Cannot convert from " + fromUnit + " to " + toUnit);
    }
  }
}
