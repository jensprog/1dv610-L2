package com.jensprog.unitconverter;

import java.util.HashMap;
import java.util.Map;

/**
 * Converts speed values between different units.
 * Units are converted through meters per second (m/s) as a base unit.
 */
public class SpeedConverter {
  private String fromUnit;
  private String toUnit;

  private static final Map<String, Double> conversion = new HashMap<>();

  static {
    conversion.put("m/s", 1.0);
    conversion.put("km/h", 0.277778);
    conversion.put("mph", 0.44704);
  }

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
    try {
      double fromFactor = conversion.get(fromUnit);
      double toFactor = conversion.get(toUnit);

      return Math.round(value * 100 * fromFactor / toFactor) / 100.0;
    } catch (Exception e) {
      throw new IllegalArgumentException("Invalid unit for speed conversion");
    }
  }
}
