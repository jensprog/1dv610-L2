package com.jensprog;

import com.jensprog.unitconverter.LengthConverter;
import com.jensprog.unitconverter.TemperatureConverter;
import com.jensprog.unitconverter.WeightConverter;

public class App {
  public static void main(String[] args) {
    TemperatureConverter temperatureConverter = new TemperatureConverter("Celsius", "Fahrenheit");
    double fahrenheit = temperatureConverter.convert(-1);
    System.out.println("-1 Celsius is " + fahrenheit + " Fahrenheit");

    LengthConverter lengthConverter = new LengthConverter("meter", "centimeter");
    double centimeters = lengthConverter.convert(1);
    System.out.println("1 meter is " + centimeters + " centimeters");

    WeightConverter weightConverter = new WeightConverter("kilogram", "tonne");
    double tonnes = weightConverter.convert(90);
    System.out.println("90 kilogram is " + tonnes + " tonnes");
  }
}