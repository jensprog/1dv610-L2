package com.jensprog.validation;

import com.jensprog.unitconverter.UnitWordTransformer;

public class UnitTypeDetector {
  private final UnitWordTransformer wordTransformer;

  public UnitTypeDetector() {
    this.wordTransformer = new UnitWordTransformer();
  }

  public String expandUnitWord(String unit) {
    return wordTransformer.expandAbbreviation(unit);
  }

  public boolean isLengthUnit(String unit) {
    return switch (expandUnitWord(unit).toLowerCase()) {
      case "meter", "millimeter", "centimeter", "decimeter", "kilometer", "inch", "foot", "yard",
          "mile" -> true;
      default -> false;
    };
  }

  public boolean isWeightUnit(String unit) {
    return switch (expandUnitWord(unit).toLowerCase()) {
      case "gram", "kilogram", "pound", "ounce", "tonne", "milligram", "microgram", "stone",
          "longton", "shortton", "hectogram", "nanogram", "grain" -> true;
      default -> false;
    };
  }

  public boolean isVolumeUnit(String unit) {
    return switch (expandUnitWord(unit).toLowerCase()) {
      case "liter", "milliliter", "gallon", "quart", "pint", "cup", "fluidounce", "tablespoon",
          "teaspoon", "cubic meter", "cubic centimeter", "cubic inch", "cubic foot", "cubic yard",
          "deciliter", "centiliter" -> true;
      default -> false;
    };
  }

  public boolean isTemperatureUnit(String unit) {
    return switch (unit.toLowerCase()) {
      case "celsius", "fahrenheit", "kelvin" -> true;
      default -> false;
    };
  }

  public boolean isSpeedUnit(String unit) {
    return switch (expandUnitWord(unit).toLowerCase()) {
      case "km/h", "kmph", "kph", "m/s", "mph" -> true;
      default -> false;
    };
  }
}
