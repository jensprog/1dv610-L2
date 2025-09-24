package com.jensprog.parser;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UnitConversionQueryParserTest {
  @Test
  public void testParse() {
    String input = "Convert 10 meters to feet";
    UnitConversionQueryParser parser = new UnitConversionQueryParser(input);
    
    assertEquals(10.0, parser.getValue());
    assertEquals("meters", parser.getFromUnit());
    assertEquals("feet", parser.getToUnit());
  }
}
