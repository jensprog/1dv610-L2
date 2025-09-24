package com.jensprog.formatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UnitConversionQueryFormatterTest {
  @Test
  public void testFormat() {
    UnitConversionQueryFormatter formatter = new UnitConversionQueryFormatter(
        1.0, "meter", 1000.0, "millimeter");
    String expected = "1.0 meter is 1000.0 millimeters";
    assertEquals(expected, formatter.format());

    formatter = new UnitConversionQueryFormatter(
        2.5, "kilometer", 1.55343, "mile");
    expected = "2.5 kilometers is 1.55343 miles";
    assertEquals(expected, formatter.format());

    formatter = new UnitConversionQueryFormatter(
        100, "foot", 30.48, "meter");
    expected = "100.0 feet is 30.48 meters";
    assertEquals(expected, formatter.format());
  }
}
