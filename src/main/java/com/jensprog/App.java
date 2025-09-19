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

    LengthConverter converter = new LengthConverter(parser.getFromUnit(),
        parser.getToUnit());

    double result = converter.convert(parser.getValue());

    UnitConversionQueryFormatter formatter = new UnitConversionQueryFormatter(parser.getValue(),
        parser.getFromUnit(), result, parser.getToUnit());
    System.out.println(formatter.format());
    scanner.close();

  }
}