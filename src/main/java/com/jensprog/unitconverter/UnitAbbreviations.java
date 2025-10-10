package com.jensprog.unitconverter;

import java.util.HashMap;
import java.util.Map;

public class UnitAbbreviations {
  private static final Map<String, String> ABBREVIATIONS = new HashMap<>();

  static {
    ABBREVIATIONS.put("m", "meter");
    ABBREVIATIONS.put("mm", "millimeter");
    ABBREVIATIONS.put("cm", "centimeter");
    ABBREVIATIONS.put("dm", "decimeter");
    ABBREVIATIONS.put("km", "kilometer");
    ABBREVIATIONS.put("in", "inch");
    ABBREVIATIONS.put("ft", "foot");
    ABBREVIATIONS.put("yd", "yard");
    ABBREVIATIONS.put("mi", "mile");

    ABBREVIATIONS.put("kg", "kilogram");
    ABBREVIATIONS.put("t", "tonne");
    ABBREVIATIONS.put("hg", "hectogram");
    ABBREVIATIONS.put("g", "gram");
    ABBREVIATIONS.put("mg", "milligram");
    ABBREVIATIONS.put("µg", "microgram");
    ABBREVIATIONS.put("ng", "nanogram");
    ABBREVIATIONS.put("lt", "longTon");
    ABBREVIATIONS.put("st", "shortTon");
    ABBREVIATIONS.put("st", "stone");
    ABBREVIATIONS.put("lb", "pound");
    ABBREVIATIONS.put("oz", "ounce");
    ABBREVIATIONS.put("gr", "grain");

    ABBREVIATIONS.put("l", "liter");
    ABBREVIATIONS.put("ml", "milliliter");
    ABBREVIATIONS.put("dl", "deciliter");
    ABBREVIATIONS.put("cl", "centiliter");
    ABBREVIATIONS.put("gal", "gallon");
    ABBREVIATIONS.put("qt", "quart");
    ABBREVIATIONS.put("pt", "pint");
    ABBREVIATIONS.put("cup", "c");
    ABBREVIATIONS.put("fl oz", "fluidOunce");
    ABBREVIATIONS.put("tbsp", "tablespoon");
    ABBREVIATIONS.put("tsp", "teaspoon");

    ABBREVIATIONS.put("m/s", "m/s");
    ABBREVIATIONS.put("kmh", "km/h");
    ABBREVIATIONS.put("mph", "mph");

    ABBREVIATIONS.put("c", "celsius");
    ABBREVIATIONS.put("f", "fahrenheit");
    ABBREVIATIONS.put("k", "kelvin");
  }

  public String getAbbreviation(String unit) {
    return ABBREVIATIONS.getOrDefault(unit.toLowerCase(), unit);
  }
}