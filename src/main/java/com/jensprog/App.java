package com.jensprog;

import com.jensprog.formatter.UnitConversionQueryFormatter;
import com.jensprog.parser.UnitConversionQueryParser;
import com.jensprog.unitconverter.UnitConversionService;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a unit to convert: ");
    String input = scanner.nextLine();

    UnitConversionQueryParser parser = new UnitConversionQueryParser(input);
    double value = parser.getValue();
    String fromUnit = parser.getFromUnit();
    String toUnit = parser.getToUnit();

    UnitConversionService conversionService = new UnitConversionService();
    double convertedValue = conversionService.convert(value, fromUnit, toUnit);

    UnitConversionQueryFormatter formatter = new UnitConversionQueryFormatter(
        value,
        fromUnit,
        convertedValue,
        toUnit
    );
    System.out.println(formatter.format());
    scanner.close();

  }
}