package com.jensprog.unitconverter;

import java.util.HashMap;
import java.util.Map;

/**
 * A utility class for pluralizing and singularizing unit names.
 */
public class UnitPluralizer {
  private final Map<String, String> singularToPlural = new HashMap<>();

  {
    singularToPlural.put("meter", "meters");
    singularToPlural.put("millimeter", "millimeters");
    singularToPlural.put("centimeter", "centimeters");
    singularToPlural.put("decimeter", "decimeters");
    singularToPlural.put("kilometer", "kilometers");
    singularToPlural.put("inch", "inches");
    singularToPlural.put("foot", "feet");
    singularToPlural.put("yard", "yards");
    singularToPlural.put("mile", "miles");

    singularToPlural.put("kilogram", "kilograms");
    singularToPlural.put("tonne", "tonnes");
    singularToPlural.put("hectogram", "hectograms");
    singularToPlural.put("gram", "grams");
    singularToPlural.put("milligram", "milligrams");
    singularToPlural.put("microgram", "micrograms");
    singularToPlural.put("nanogram", "nanograms");
    singularToPlural.put("longTon", "longTons");
    singularToPlural.put("shortTon", "shortTons");
    singularToPlural.put("stone", "stones");
    singularToPlural.put("pound", "pounds");
    singularToPlural.put("ounce", "ounces");
    singularToPlural.put("grain", "grains");

    singularToPlural.put("liter", "liters");
    singularToPlural.put("milliliter", "milliliters");
    singularToPlural.put("gallon", "gallons");
    singularToPlural.put("quart", "quarts");
    singularToPlural.put("pint", "pints");
    singularToPlural.put("cup", "cups");
    singularToPlural.put("fluidOunce", "fluidOunces");

    singularToPlural.put("meterPerSecond", "metersPerSecond");
    singularToPlural.put("kilometerPerHour", "kilometersPerHour");
    singularToPlural.put("milePerHour", "milesPerHour");

    singularToPlural.put("celsius", "celsius");
    singularToPlural.put("fahrenheit", "fahrenheit");
    singularToPlural.put("kelvin", "kelvin");
  }

  private final Map<String, String> pluralToSingular = new HashMap<>();

  public UnitPluralizer() {
    reversePluralToSingular();
  }

  public String pluralize(String unit, double value) {
    if (value == 1.0) {
      return unit;
    }
    return singularToPlural.getOrDefault(unit, unit + "s");
  }

  public String singularize(String unit) {
    return pluralToSingular.getOrDefault(unit, unit);
  }

  private void reversePluralToSingular() {
    for (Map.Entry<String, String> entry : singularToPlural.entrySet()) {
      pluralToSingular.put(entry.getValue(), entry.getKey());
    }
  }
}
