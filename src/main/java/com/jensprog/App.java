package com.jensprog;

import com.jensprog.unitconverter.TemperatureConverter;

public class App {
    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter("Celsius", "Fahrenheit");
        double fahrenheit = temperatureConverter.convert(25);
        System.out.println("25 Celsius is " + fahrenheit + " Fahrenheit");
    }
}