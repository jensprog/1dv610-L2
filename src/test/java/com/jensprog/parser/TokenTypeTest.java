package com.jensprog.parser;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TokenTypeTest {
  @Test
  public void testTokenTypeValues() {
    assertEquals("NUMBER", TokenType.NUMBER.name());
    assertEquals("WORD", TokenType.WORD.name());
    assertEquals("UNIT", TokenType.UNIT.name());
    assertEquals("EOF", TokenType.EOF.name());
  }
}
