package com.jensprog.unitconverter;

import com.jensprog.validation.UnitTypeDetector;

/**
 * Service class for packaging all unit conversion.
 * Facade pattern to simplify usage of different converters.
 */
public class UnitConversionService {
  private LengthConverter lengthConverter = new LengthConverter(null, null);
  private WeightConverter weightConverter = new WeightConverter(null, null);
  private VolumeConverter volumeConverter = new VolumeConverter(null, null);
  private TemperatureConverter temperatureConverter = new TemperatureConverter(null, null);
  private SpeedConverter speedConverter = new SpeedConverter(null, null);
  private final UnitTypeDetector unitTypeDetector;

  public UnitConversionService() {
    this.unitTypeDetector = new UnitTypeDetector();
  }

  private double convertLength(double value, String fromUnit, String toUnit) {
    lengthConverter.setFromUnit(unitTypeDetector.expandUnitWord(fromUnit));
    lengthConverter.setToUnit(unitTypeDetector.expandUnitWord(toUnit));
    return lengthConverter.convert(value);
  }

  private double convertWeight(double value, String fromUnit, String toUnit) {
    weightConverter.setFromUnit(unitTypeDetector.expandUnitWord(fromUnit));
    weightConverter.setToUnit(unitTypeDetector.expandUnitWord(toUnit));
    return weightConverter.convert(value);
  }

  private double convertVolume(double value, String fromUnit, String toUnit) {
    volumeConverter.setFromUnit(unitTypeDetector.expandUnitWord(fromUnit));
    volumeConverter.setToUnit(unitTypeDetector.expandUnitWord(toUnit));
    return volumeConverter.convert(value);
  }

  private double convertTemperature(double value, String fromUnit, String toUnit) {
    temperatureConverter.setFromUnit(unitTypeDetector.expandUnitWord(fromUnit));
    temperatureConverter.setToUnit(unitTypeDetector.expandUnitWord(toUnit));
    return temperatureConverter.convert(value);
  }

  private double convertSpeed(double value, String fromUnit, String toUnit) {
    speedConverter.setFromUnit(unitTypeDetector.expandUnitWord(fromUnit));
    speedConverter.setToUnit(unitTypeDetector.expandUnitWord(toUnit));
    return speedConverter.convert(value);
  }

  public double convert(double value, String fromUnit, String toUnit) {
    if (unitTypeDetector.isLengthUnit(fromUnit) && unitTypeDetector.isLengthUnit(toUnit)) {
      return convertLength(value, fromUnit, toUnit);
    }
    if (unitTypeDetector.isWeightUnit(fromUnit) && unitTypeDetector.isWeightUnit(toUnit)) {
      return convertWeight(value, fromUnit, toUnit);
    }
    if (unitTypeDetector.isVolumeUnit(fromUnit) && unitTypeDetector.isVolumeUnit(toUnit)) {
      return convertVolume(value, fromUnit, toUnit);
    }
    if (unitTypeDetector.isTemperatureUnit(fromUnit) && unitTypeDetector.isTemperatureUnit(toUnit)) {
      return convertTemperature(value, fromUnit, toUnit);
    }
    if (unitTypeDetector.isSpeedUnit(fromUnit) && unitTypeDetector.isSpeedUnit(toUnit)) {
      return convertSpeed(value, fromUnit, toUnit);
    }
    throw new IllegalArgumentException("Cannot convert from " + fromUnit + " to " + toUnit);
  }
}
