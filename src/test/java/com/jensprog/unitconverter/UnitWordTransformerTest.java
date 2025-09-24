package com.jensprog.unitconverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UnitWordTransformerTest {
  @Test
  public void testPluralize() {
    UnitWordTransformer wordTransformer = new UnitWordTransformer();
    assertEquals("meters", wordTransformer.pluralize("meter", 2));
    assertEquals("feet", wordTransformer.pluralize("foot", 2));
    assertEquals("inches", wordTransformer.pluralize("inch", 2));
    assertEquals("celsius", wordTransformer.pluralize("celsius", 2));
    assertEquals("km/h", wordTransformer.pluralize("km/h", 2));
  }

  @Test
  public void testSingularize() {
    UnitWordTransformer wordTransformer = new UnitWordTransformer();
    assertEquals("meter", wordTransformer.singularize("meters"));
    assertEquals("foot", wordTransformer.singularize("feet"));
    assertEquals("inch", wordTransformer.singularize("inches"));
    assertEquals("celsius", wordTransformer.singularize("celsius"));
    assertEquals("km/h", wordTransformer.singularize("km/h"));
  }
}