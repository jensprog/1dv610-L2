package com.jensprog.parser;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TokenizerTest {
  @Test
  public void testScanTokens() {
    String input = "Convert 10 meters to feet";
    Tokenizer tokenizer = new Tokenizer(input);
    var tokens = tokenizer.scanTokens();
    
    assertEquals(6, tokens.size());
    assertEquals(TokenType.WORD, tokens.get(0).getType());
    assertEquals("Convert", tokens.get(0).getText());
    assertEquals(TokenType.NUMBER, tokens.get(1).getType());
    assertEquals(10.0, tokens.get(1).getValue());
    assertEquals(TokenType.UNIT, tokens.get(2).getType());
    assertEquals("meters", tokens.get(2).getText());
    assertEquals(TokenType.WORD, tokens.get(3).getType());
    assertEquals("to", tokens.get(3).getText());
    assertEquals(TokenType.UNIT, tokens.get(4).getType());
    assertEquals("feet", tokens.get(4).getText());
  }
}
