package com.jensprog.unitconverter;

import java.util.HashMap;

/**
 * Converts volume values between different units.
 */
public class VolumeConverter {
  private String fromUnit;
  private String toUnit;

  private static final HashMap<String, Double> conversion = new HashMap<>();

  static {
    conversion.put("liter", 1.0);
    conversion.put("deciliter", 0.1);
    conversion.put("centiliter", 0.01);
    conversion.put("milliliter", 0.001);
    conversion.put("cubic meter", 1000.0);
    conversion.put("cubic centimeter", 0.001);
    conversion.put("cubic inch", 0.0163871);
    conversion.put("cubic foot", 28.3168);
    conversion.put("cubic yard", 764.555);
    conversion.put("gallon", 3.78541);
    conversion.put("quart", 0.946353);
    conversion.put("pint", 0.473176);
    conversion.put("cup", 0.24);
    conversion.put("fluid ounce", 0.0295735);
    conversion.put("tablespoon", 0.0147868);
    conversion.put("teaspoon", 0.00492892);
  }

  public VolumeConverter(String fromUnit, String toUnit) {
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
