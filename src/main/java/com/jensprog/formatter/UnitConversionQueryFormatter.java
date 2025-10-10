package com.jensprog.formatter;

import com.jensprog.unitconverter.UnitWordTransformer;

/**
 * Formats the result of a unit conversion to display to the user.
 */
public class UnitConversionQueryFormatter {
  private double originalValue;
  private String fromUnit;
  private double convertedValue;
  private String toUnit;
  private final UnitWordTransformer wordTransformer = new UnitWordTransformer();

  public UnitConversionQueryFormatter(double originalValue, String fromUnit,
      double convertedValue, String toUnit) {
    this.originalValue = originalValue;
    this.fromUnit = fromUnit;
    this.convertedValue = convertedValue;
    this.toUnit = toUnit;
  }

  public String format() {
    String fromUnitFormatted = wordTransformer.pluralize(fromUnit, originalValue);
    String toUnitFormatted = wordTransformer.pluralize(toUnit, convertedValue);
    return originalValue + " " + fromUnitFormatted + " is "
        + convertedValue + " " + toUnitFormatted;
  }
}
