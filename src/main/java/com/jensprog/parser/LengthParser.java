package com.jensprog.parser;

public class LengthParser {
  private String input;
  private String fromUnit;
  private String toUnit;
  private double value;

  public LengthParser(String input) {
    this.input = input;
    parse();
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

  private void validateStringFormat() {
    if (input == null || input.length() < 4 || input.isEmpty()) {
      throw new IllegalArgumentException("Input cannot be null, have less than 4 elements "
          + "or be empty");
    }
  }

  private void validateValueInput() {
    if (value < 0 || Double.isInfinite(value)) {
      throw new IllegalArgumentException("Value cannot be negative or infinite");
    }
  }

  private void checkElementsLength(String[] parts) {
    if (parts.length != 4) {
      throw new IllegalArgumentException("Invalid format: expected "
          + "'<value> <fromUnit> to <toUnit>'");
    }
  }

  private void checkToKeyword(String[] parts) {
    if (!parts[2].equals("to")) {
      throw new IllegalArgumentException("Input string must contain 'to' as the third element");
    }
  }

  private void parse() {
    String[] parts = input.trim().split(" ");
    validateStringFormat();
    checkElementsLength(parts);
    checkToKeyword(parts);

    try {
      value = Double.parseDouble(parts[0]);

    } catch (NumberFormatException e) {
      throw new IllegalArgumentException("The value must be a valid number");
    }
    fromUnit = parts[1];
    toUnit = parts[3];
    validateValueInput();
  }
}
