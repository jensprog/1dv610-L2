package com.jensprog.parser;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TokenTypeTest {
  @Test
  public void testTokenTypeNumber() {
    assertEquals("NUMBER", TokenType.NUMBER.name());
  }

  @Test
  public void testTokenTypeWord() {
    assertEquals("WORD", TokenType.WORD.name());
  }

  @Test
  public void testTokenTypeUnit() {
    assertEquals("UNIT", TokenType.UNIT.name());
  }

  @Test
  public void testTokenTypeEndOfFile() {
    assertEquals("EOF", TokenType.EOF.name());
  }
}
