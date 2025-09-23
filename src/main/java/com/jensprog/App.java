package com.jensprog;

import com.jensprog.formatter.UnitConversionQueryFormatter;
import com.jensprog.parser.UnitConversionQueryParser;
import com.jensprog.unitconverter.LengthConverter;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter length to convert (e.g., '15.5 meter to kilometer'): ");
    String input = scanner.nextLine();

    UnitConversionQueryParser parser = new UnitConversionQueryParser(input);
    double value = parser.getValue();
    String fromUnit = parser.getFromUnit();
    String toUnit = parser.getToUnit();

    LengthConverter converter = new LengthConverter(fromUnit, toUnit);
    double convertedValue = converter.convert(value);

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