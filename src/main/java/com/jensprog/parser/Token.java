package com.jensprog.parser;

/**
 * Token class holds the data for each token.
 */
public class Token {
  private TokenType type;
  private String text;
  private double value;
  private int position;

  public Token(TokenType type, String text, double value, int position) {
    this.type = type;
    this.text = text;
    this.value = value;
    this.position = position;
  }

  public TokenType getType() {
    return type;
  }

  public String getText() {
    return text;
  }

  public double getValue() {
    return value;
  }

  public int getPosition() {
    return position;
  }
}
