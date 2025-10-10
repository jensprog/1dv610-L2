package com.jensprog.unitconverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class VolumeConverterTest {
  @Test
  public void testLitertoMillileter() {
    VolumeConverter volumeconverter = new VolumeConverter("liter", "milliliter");
    double input = 1;
    double expected = 1000;
    assertEquals(expected, volumeconverter.convert(input));
  }

  @Test
  public void testGallonToLiter() {
    VolumeConverter volumeconverter = new VolumeConverter("gallon", "liter");
    double input = 1;
    double expected = 3.79;
    assertEquals(expected, volumeconverter.convert(input));
  }

  @Test
  public void testCubicMeterToCubicFoot() {
    VolumeConverter volumeConverter = new VolumeConverter("cubic meter", "cubic foot");
    double input = 1;
    double expected = 35.31;
    assertEquals(expected, volumeConverter.convert(input));
  }
}
