package com.jensprog.parser;

public class UnitConversionQueryParser {
  private String input;
  private String fromUnit;
  private String toUnit;
  private double value;

  public UnitConversionQueryParser(String input) {
    this.input = input;
    parseString();
  }

  public String getFromUnit() {
    return fromUnit;
  }

  public String getToUnit() {
    return toUnit;
  }

  public double getValue() {
    return value;
  }

  private double extractValue(String[] parts) {
    return Double.parseDouble(parts[0]);
  }

  private String extractFromUnit(String[] parts) {
    return parts[1];
  }

  private String extractToUnit(String[] parts) {
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

  private void parseString() {
    validateStringFormat(input);
    String[] parts = input.trim().split(" ");
    checkElementsLength(parts);
    checkToKeyword(parts);

    this.value = extractValue(parts);
    this.fromUnit = extractFromUnit(parts);
    this.toUnit = extractToUnit(parts);
  }
}
