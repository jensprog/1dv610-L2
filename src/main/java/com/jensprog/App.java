package com.jensprog;

import com.jensprog.data.ConversionRequest;
import com.jensprog.formatter.UnitConversionQueryFormatter;
import com.jensprog.parser.UnitConversionQueryParser;
import com.jensprog.unitconverter.LengthConverter;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter length to convert (e.g., '15.5 meter to kilometer'): ");
    String input = scanner.nextLine();

    UnitConversionQueryParser parser = new UnitConversionQueryParser();
    ConversionRequest request = parser.parse(input);

    LengthConverter lengthConverter = 
        new LengthConverter(request.getFromUnit(), request.getToUnit());
    double convertedValue = lengthConverter.convert(request.getValue());

    UnitConversionQueryFormatter formatter = new UnitConversionQueryFormatter(
        request.getValue(),
        request.getFromUnit(),
        convertedValue,
        request.getToUnit()
    );
    System.out.println(formatter.format());
    scanner.close();

  }
}