package com.jensprog.unitconverter;

import java.util.HashMap;

/**
 * Converts weight values between different units.
 */
public class WeightConverter {
  private String fromUnit;
  private String toUnit;

  private static final HashMap<String, Double> conversion = new HashMap<>();

  static {
    conversion.put("kilogram", 1.0);
    conversion.put("tonne", 1000.0);
    conversion.put("hectogram", 0.1);
    conversion.put("gram", 0.001);
    conversion.put("milligram", 0.000001);
    conversion.put("microgram", 0.000000001);
    conversion.put("nanogram", 0.000000000001);
    conversion.put("longTon", 1016.0469088);
    conversion.put("shortTon", 907.18474);
    conversion.put("stone", 6.35029318);
    conversion.put("pound", 0.45359237);
    conversion.put("ounce", 0.028349523125);
    conversion.put("grain", 0.00006479891);
  }

  public WeightConverter(String fromUnit, String toUnit) {
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
      throw new IllegalArgumentException("Cannot convert " + fromUnit + " to " + toUnit);
    }
  }
}
