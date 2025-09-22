package com.jensprog.parser;

import java.util.ArrayList;
import java.util.List;

public class Tokenizer {
  private final String input;
  private final List<Token> tokens = new ArrayList<>();

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
