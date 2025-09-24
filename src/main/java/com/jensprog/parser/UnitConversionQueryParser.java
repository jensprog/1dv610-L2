package com.jensprog.parser;

import java.util.List;

/**
 * Parses a unit conversion query from a string input.
 */
public class UnitConversionQueryParser {
  private double value;
  private String fromUnit;
  private String toUnit;

  public UnitConversionQueryParser(String input) {
    Tokenizer tokenizer = new Tokenizer(input);
    var tokens = tokenizer.scanTokens();
    parse(tokens);
  }

  public double getValue() {
    return value;
  }

  public String getFromUnit() {
    return fromUnit;
  }

  public String getToUnit() {
    return toUnit;
  }

  private void extractValue(List<Token> tokens) {
    for (Token token : tokens) {
      if (token.getType() == TokenType.NUMBER) {
        this.value = token.getValue();
        return;
      }
    }
    throw new IllegalArgumentException("No numeric value found in the input.");
  }

  private void extractFromUnit(List<Token> tokens) {
    for (Token token : tokens) {
      if (token.getType() == TokenType.UNIT) {
        this.fromUnit = token.getText();
        return;
      }
    }
    throw new IllegalArgumentException("No 'from' unit found in the input.");
  }

  private void extractToUnit(List<Token> tokens) {
    boolean foundFromUnit = false;
    for (Token token : tokens) {
      if (token.getType() == TokenType.UNIT) {
        if (foundFromUnit) {
          this.toUnit = token.getText();
          return;
        }
        foundFromUnit = true;
      }
    }
    throw new IllegalArgumentException("No 'to' unit found in the input.");
  }

  private void validateConversion() {
    if (fromUnit == null || toUnit == null) {
      throw new IllegalArgumentException("Both fromUnit and toUnit must be specified.");
    }
    if (fromUnit.equals(toUnit)) {
      throw new IllegalArgumentException("fromUnit and toUnit cannot be the same.");
    }
  }

  private void parse(List<Token> tokens) {
    extractValue(tokens);
    extractFromUnit(tokens);
    extractToUnit(tokens);
    validateConversion();
  }
}