package com.jensprog.unitconverter;

import java.util.HashMap;

public class WeightConverter {
  private String fromUnit;
  private String toUnit;

  private static final HashMap<String, Double> toKilograms = new HashMap<>();

  static {
    toKilograms.put("kilogram", 1.0);
    toKilograms.put("tonne", 1000.0);
    toKilograms.put("hectogram", 0.1);
    toKilograms.put("gram", 0.001);
    toKilograms.put("milligram", 0.000001);
    toKilograms.put("microgram", 0.000000001);
    toKilograms.put("nanogram", 0.000000000001);
    toKilograms.put("longTon", 1016.0469088);
    toKilograms.put("shortTon", 907.18474);
    toKilograms.put("stone", 6.35029318);
    toKilograms.put("pound", 0.45359237);
    toKilograms.put("ounce", 0.028349523125);
    toKilograms.put("grain", 0.00006479891);
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
      double fromFactor = toKilograms.get(fromUnit);
      double toFactor = toKilograms.get(toUnit);

      return value * fromFactor / toFactor;
    } catch (Exception e) {
      throw new IllegalArgumentException("Cannot convert " + fromUnit + " to " + toUnit);
    }
  }
}
