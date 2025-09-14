package com.jensprog.unitconverter;

import java.util.HashMap;

/**
 * A utility class for converting length values.
 * Units are converted through meters as a base unit.
 */
public class LengthConverter {
  private String fromUnit;
  private String toUnit;

  private static final HashMap<String, Double> conversion = new HashMap<>();

  static {
    conversion.put("meter", 1.0);
    conversion.put("millimeter", 0.001);
    conversion.put("centimeter", 0.01);
    conversion.put("decimeter", 0.1);
    conversion.put("kilometer", 1000.0);
    conversion.put("inch", 0.0254);
    conversion.put("foot", 0.3048);
    conversion.put("yard", 0.9144);
    conversion.put("mile", 1609.34);
    conversion.put("nautical mile", 1852.0);
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
      double fromFactor = conversion.get(fromUnit);
      double toFactor = conversion.get(toUnit);

      return value * fromFactor / toFactor;
    } catch (Exception e) {
      throw new IllegalArgumentException("Cannot convert from " + fromUnit + " to " + toUnit);
    }
  }
}
