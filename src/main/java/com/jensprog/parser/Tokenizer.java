package com.jensprog.parser;

import com.jensprog.unitconverter.UnitAbbreviations;
import com.jensprog.unitconverter.UnitWordTransformer;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Tokenizer class breaks the input string into tokens.
 */
public class Tokenizer {
  private final String input;
  private final List<Token> tokens = new ArrayList<>();
  private final UnitWordTransformer wordTransformer;
  private final UnitAbbreviations abbreviations;
  private static final Set<String> VALID_UNITS = Set.of(
      "meter", "kilometer",
      "mile", "foot", "inch", "centimeter",
      "millimeter", "yard", "decimeter",

      "gram", "kilogram", "pound", "ounce",
      "tonne", "milligram", "microgram",
      "stone", "longTon", "shortTon", "hectogram",
      "nanogram", "grain",

      "liter", "milliliter", "gallon", "quart", 
      "pint", "cup", "fluidounce", "tablespoon",
      "teaspoon", "cubic meter", "cubic centimeter", 
      "cubic inch", "cubic foot", "cubic yard", "deciliter", "centiliter",

      "km/h", "kmph", "kph", "m/s", "mph",

      "celsius", "fahrenheit", "kelvin"
      );

  public Tokenizer(String input, UnitWordTransformer wordTransformer,
      UnitAbbreviations abbreviations) {
    this.input = input;
    this.wordTransformer = wordTransformer;
    this.abbreviations = abbreviations;
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
      return position + 1;
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

    String wordText = input.substring(start, position).toLowerCase();
    String singularForm = wordTransformer.singularize(wordText);
    String expandedForm = abbreviations.expandAbbreviation(wordText);

    if (VALID_UNITS.contains(singularForm)) {
      tokens.add(new Token(TokenType.UNIT, singularForm, 0, start));
      return position;
    }

    if (VALID_UNITS.contains(expandedForm)) {
      tokens.add(new Token(TokenType.UNIT, expandedForm, 0, start));
      return position;
    }

    tokens.add(new Token(TokenType.WORD, singularForm, 0, start));
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
