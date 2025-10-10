package com.jensprog.unitconverter;

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

  public double convertLength(double value, String fromUnit, String toUnit) {
    lengthConverter.setFromUnit(fromUnit);
    lengthConverter.setToUnit(toUnit);
    return lengthConverter.convert(value);
  }

  public double convertWeight(double value, String fromUnit, String toUnit) {
    weightConverter.setFromUnit(fromUnit);
    weightConverter.setToUnit(toUnit);
    return weightConverter.convert(value);
  }

  public double convertVolume(double value, String fromUnit, String toUnit) {
    volumeConverter.setFromUnit(fromUnit);
    volumeConverter.setToUnit(toUnit);
    return volumeConverter.convert(value);
  }

  public double convertTemperature(double value, String fromUnit, String toUnit) {
    temperatureConverter.setFromUnit(fromUnit);
    temperatureConverter.setToUnit(toUnit);
    return temperatureConverter.convert(value);
  }

  public double convertSpeed(double value, String fromUnit, String toUnit) {
    speedConverter.setFromUnit(fromUnit);
    speedConverter.setToUnit(toUnit);
    return speedConverter.convert(value);
  }

  private boolean isLengthUnit(String unit) {
    return switch (unit.toLowerCase()) {
      case "meter", "millimeter", "centimeter", "decimeter", "kilometer", "inch", "foot", "yard",
          "mile" -> true;
      default -> false;
    };
  }

  private boolean isWeightUnit(String unit) {
    return switch (unit.toLowerCase()) {
      case "gram", "kilogram", "pound", "ounce", "tonne", "milligram", "microgram", "stone",
          "longton", "shortton", "hectogram", "nanogram", "grain" -> true;
      default -> false;
    };
  }

  private boolean isVolumeUnit(String unit) {
    return switch (unit.toLowerCase()) {
      case "liter", "milliliter", "gallon", "quart", "pint", "cup", "fluidounce", "tablespoon",
          "teaspoon", "cubic meter", "cubic centimeter", "cubic inch", "cubic foot", "cubic yard",
          "deciliter", "centiliter" -> true;
      default -> false;
    };
  }

  private boolean isTemperatureUnit(String unit) {
    return switch (unit.toLowerCase()) {
      case "celsius", "fahrenheit", "kelvin" -> true;
      default -> false;
    };
  }

  private boolean isSpeedUnit(String unit) {
    return switch (unit.toLowerCase()) {
      case "km/h", "kmph", "kph", "m/s", "mph" -> true;
      default -> false;
    };
  }

  public double convert(double value, String fromUnit, String toUnit) {
    if (isLengthUnit(fromUnit) && isLengthUnit(toUnit)) {
      return convertLength(value, fromUnit, toUnit);
    } else if (isWeightUnit(fromUnit) && isWeightUnit(toUnit)) {
      return convertWeight(value, fromUnit, toUnit);
    } else if (isVolumeUnit(fromUnit) && isVolumeUnit(toUnit)) {
      return convertVolume(value, fromUnit, toUnit);
    } else if (isTemperatureUnit(fromUnit) && isTemperatureUnit(toUnit)) {
      return convertTemperature(value, fromUnit, toUnit);
    } else if (isSpeedUnit(fromUnit) && isSpeedUnit(toUnit)) {
      return convertSpeed(value, fromUnit, toUnit);
    } else {
      throw new IllegalArgumentException("Incompatible units: " + fromUnit + " and " + toUnit);
    }
  }
}
