package com.jensprog.unitconverter;

import java.util.HashMap;
import java.util.Map;

/**
 * A utility class for pluralizing and singularizing unit names.
 * Also handles abbreviations.
 */
public class UnitWordTransformer {
  private static final Map<String, String> SINGULARTOPLURAL = new HashMap<>();

  static {
    SINGULARTOPLURAL.put("meter", "meters");
    SINGULARTOPLURAL.put("millimeter", "millimeters");
    SINGULARTOPLURAL.put("centimeter", "centimeters");
    SINGULARTOPLURAL.put("decimeter", "decimeters");
    SINGULARTOPLURAL.put("kilometer", "kilometers");
    SINGULARTOPLURAL.put("inch", "inches");
    SINGULARTOPLURAL.put("foot", "feet");
    SINGULARTOPLURAL.put("yard", "yards");
    SINGULARTOPLURAL.put("mile", "miles");

    SINGULARTOPLURAL.put("kilogram", "kilograms");
    SINGULARTOPLURAL.put("tonne", "tonnes");
    SINGULARTOPLURAL.put("hectogram", "hectograms");
    SINGULARTOPLURAL.put("gram", "grams");
    SINGULARTOPLURAL.put("milligram", "milligrams");
    SINGULARTOPLURAL.put("microgram", "micrograms");
    SINGULARTOPLURAL.put("nanogram", "nanograms");
    SINGULARTOPLURAL.put("longTon", "longTons");
    SINGULARTOPLURAL.put("shortTon", "shortTons");
    SINGULARTOPLURAL.put("stone", "stones");
    SINGULARTOPLURAL.put("pound", "pounds");
    SINGULARTOPLURAL.put("ounce", "ounces");
    SINGULARTOPLURAL.put("grain", "grains");

    SINGULARTOPLURAL.put("liter", "liters");
    SINGULARTOPLURAL.put("milliliter", "milliliters");
    SINGULARTOPLURAL.put("gallon", "gallons");
    SINGULARTOPLURAL.put("quart", "quarts");
    SINGULARTOPLURAL.put("pint", "pints");
    SINGULARTOPLURAL.put("cup", "cups");
    SINGULARTOPLURAL.put("fluidounce", "fluidounces");

    SINGULARTOPLURAL.put("m/s", "m/s");
    SINGULARTOPLURAL.put("km/h", "km/h");
    SINGULARTOPLURAL.put("mph", "mph");

    SINGULARTOPLURAL.put("celsius", "celsius");
    SINGULARTOPLURAL.put("fahrenheit", "fahrenheit");
    SINGULARTOPLURAL.put("kelvin", "kelvin");
  }

  private static final Map<String, String> ABBREVIATIONS = new HashMap<>();

  static {
    ABBREVIATIONS.put("m", "meter");
    ABBREVIATIONS.put("mm", "millimeter");
    ABBREVIATIONS.put("cm", "centimeter");
    ABBREVIATIONS.put("dm", "decimeter");
    ABBREVIATIONS.put("km", "kilometer");
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
    ABBREVIATIONS.put("tn", "shortTon");
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
    ABBREVIATIONS.put("c", "cup");
    ABBREVIATIONS.put("floz", "fluidounce");
    ABBREVIATIONS.put("tbsp", "tablespoon");
    ABBREVIATIONS.put("tsp", "teaspoon");

    ABBREVIATIONS.put("kmh", "km/h");
  }

  private static final Map<String, String> PLURALTOSINGULAR = new HashMap<>();

  public UnitWordTransformer() {
    reversePluralToSingular();
  }

  public String expandAbbreviation(String unit) {
    return ABBREVIATIONS.getOrDefault(unit.toLowerCase(), unit);
  }

  public String pluralize(String unit, double value) {
    if (value == 1.0) {
      return unit;
    }
    return SINGULARTOPLURAL.getOrDefault(unit, unit + "s");
  }

  public String singularize(String unit) {
    return PLURALTOSINGULAR.getOrDefault(unit, unit);
  }

  private void reversePluralToSingular() {
    for (Map.Entry<String, String> entry : SINGULARTOPLURAL.entrySet()) {
      PLURALTOSINGULAR.put(entry.getValue(), entry.getKey());
    }
  }
}
