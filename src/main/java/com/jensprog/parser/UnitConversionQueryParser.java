package com.jensprog.parser;

import com.jensprog.data.ConversionRequest;

public class UnitConversionQueryParser {

  private double extractValue(String input) {
    String[] parts = input.trim().split(" ");
    return Double.parseDouble(parts[0]);
  }

  private String extractFromUnit(String input) {
    String[] parts = input.trim().split(" ");
    return parts[1];
  }

  private String extractToUnit(String input) {
    String[] parts = input.trim().split(" ");
    return parts[3];
  }

  private void validateStringFormat(String input) {
    if (input == null || input.length() < 4 || input.isEmpty()) {
      throw new IllegalArgumentException("Input cannot be null, have less than 4 elements");
    }
  }

  private void checkElementsLength(String[] parts) {
    if (parts.length != 4) {
      throw new IllegalArgumentException("Input string must have exactly 4 elements");
    }
  }

  private void checkToKeyword(String[] parts) {
    if (!parts[2].equals("to")) {
      throw new IllegalArgumentException("Input string must contain 'to' as the third element");
    }
  }

  public ConversionRequest parse(String input) {
    validateStringFormat(input);
    String[] parts = input.trim().split(" ");
    checkElementsLength(parts);
    checkToKeyword(parts);
    
    double value = extractValue(input);
    String fromUnit = extractFromUnit(input);
    String toUnit = extractToUnit(input);

    return new ConversionRequest(value, fromUnit, toUnit);
  }
}
