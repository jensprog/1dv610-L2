package com.jensprog.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Tokenizer {
  private final String input;
  private final List<Token> tokens = new ArrayList<>();
  private static final Set<String> VALID_UNITS = Set.of(
      // Length units
      "meter", "meters", "kilometer", "kilometers",
      "mile", "miles", "foot", "feet", "inch", "inches", "centimeter", "centimeters",
      "millimeter", "millimeters", "yard", "yards", "decimeter", "decimeters",

      // Weight units
      "gram", "grams", "kilogram", "kilograms", "pound", "pounds", "ounce", "ounces",
      "tonne", "tonnes", "milligram", "milligrams", "microgram", "micrograms",
      "stone", "stones", "longTon", "longTons", "shortTon", "shortTons", "hectogram", "hectograms",
      "nanogram", "nanograms",
      "grain", "grains",

      // Volume units
      "liter", "liters", "milliliter", "milliliters", "gallon", "gallons", "quart", "quarts", 
      "pint", "pints", "cup", "cups", "fluid ounce", "fluid ounces", "tablespoon", "tablespoons",
      "teaspoon", "teaspoons", "cubic meter", "cubic meters", "cubic centimeter", 
      "cubic centimeters", "cubic inch", "cubic inches", "cubic foot", "cubic feet", 
      "cubic yard", "cubic yards", "deciliter", "deciliters", "centiliter", "centiliters",

      // Speed units
      "km/h", "kmph", "kph", "m/s", "mph",

      // Temperature units
      "celsius", "fahrenheit", "kelvin"
      );

  public Tokenizer(String input) {
    this.input = input;
  }

  public List<Token> scanTokens() {
    int position = 0;
    while (position < input.length()) {
      position = scanNextToken(position);
    }
    
    addEndOfFileToken(position);
    return tokens;
  }

  private int scanNextToken(int position) {
    char currentChar = input.charAt(position);

    if (Character.isWhitespace(currentChar)) {
      return position + 1; // Skip whitespace
    }

    if (Character.isDigit(currentChar) || currentChar == '.') {
      return scanNumber(position);
    }

    if (Character.isLetter(currentChar)) {
      return scanWord(position);
    }

    return scanUnknownCharacter(position);
  }

  private int scanNumber(int position) {
    int start = position;
    boolean hasDecimalPoint = false;

    while (position < input.length()) {
      char currentChar = input.charAt(position);
      if (Character.isDigit(currentChar)) {
        position++;
      } else if (currentChar == '.' && !hasDecimalPoint) {
        hasDecimalPoint = true;
        position++;
      } else {
        break;
      }
    }

    String numberText = input.substring(start, position);
    double value = Double.parseDouble(numberText);
    tokens.add(new Token(TokenType.NUMBER, numberText, value, start));
    return position;
  }

  private int scanWord(int position) {
    int start = position;

    while (position < input.length() && Character.isLetter(input.charAt(position))) {
      position++;
    }

    if (VALID_UNITS.contains(input.substring(start, position).toLowerCase())) {
      String unitText = input.substring(start, position);
      tokens.add(new Token(TokenType.UNIT, unitText, 0, start));
      return position;
    }

    String wordText = input.substring(start, position);
    tokens.add(new Token(TokenType.WORD, wordText, 0, start));
    return position;
  }

  private int scanUnknownCharacter(int position) {
    char currentChar = input.charAt(position);
    tokens.add(new Token(TokenType.WORD, String.valueOf(currentChar), 0, position));
    return position + 1;
  }

  private void addEndOfFileToken(int position) {
    tokens.add(new Token(TokenType.EOF, "", 0, position));
  }
}
