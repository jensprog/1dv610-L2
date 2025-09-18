package com.jensprog;

import com.jensprog.formatter.LengthStringFormatter;
import com.jensprog.parser.LengthParser;
import com.jensprog.unitconverter.LengthConverter;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter length to convert (e.g., '15.5 meter to kilometer'): ");
    String input = scanner.nextLine();

    LengthParser lengthParser = new LengthParser(input);

    LengthConverter lengthConverter = new LengthConverter(lengthParser.getFromUnit(),
        lengthParser.getToUnit());

    double result = lengthConverter.convert(lengthParser.getValue());

    LengthStringFormatter formatter = new LengthStringFormatter(lengthParser.getValue(),
        lengthParser.getFromUnit(), result, lengthParser.getToUnit());
    System.out.println(formatter.format());
    scanner.close();

  }
}