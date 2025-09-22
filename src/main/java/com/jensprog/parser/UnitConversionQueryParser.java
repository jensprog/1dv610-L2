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

  private void parseString() {
    
  }
}
