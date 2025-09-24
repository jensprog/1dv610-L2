package com.jensprog.parser;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TokenTest {
  @Test
  public void testTokenCreationWithNumber() {
    Token token = new Token(TokenType.NUMBER, "10", 10.0, 0);
    assertEquals(TokenType.NUMBER, token.getType());
    assertEquals("10", token.getText());
    assertEquals(10.0, token.getValue());
    assertEquals(0, token.getPosition());
  }

  @Test
  public void testTokenCreationWithWord() {
    Token token = new Token(TokenType.WORD, "Convert", 0.0, 0);
    assertEquals(TokenType.WORD, token.getType());
    assertEquals("Convert", token.getText());
    assertEquals(0.0, token.getValue());
    assertEquals(0, token.getPosition());
  }

  @Test
  public void testTokenCreationWithUnit() {
    Token token = new Token(TokenType.UNIT, "meters", 0.0, 0);
    assertEquals(TokenType.UNIT, token.getType());
    assertEquals("meters", token.getText());
    assertEquals(0.0, token.getValue());
    assertEquals(0, token.getPosition());
  }

  @Test
  public void testTokenCreationWithEof() {
    Token token = new Token(TokenType.EOF, "", 0.0, 0);
    assertEquals(TokenType.EOF, token.getType());
    assertEquals("", token.getText());
    assertEquals(0.0, token.getValue());
    assertEquals(0, token.getPosition());
  }
}
