package com.jensprog;

import com.jensprog.formatter.LengthStringFormatter;
import com.jensprog.parser.LengthParser;
import com.jensprog.unitconverter.LengthConverter;

public class App {
  public static void main(String[] args) {
  
    LengthParser lengthParser = new LengthParser("62.4 meter to centimeter");
    LengthConverter lengthConverter = new LengthConverter(lengthParser.getFromUnit(),
        lengthParser.getToUnit());

    double result = lengthConverter.convert(lengthParser.getValue());

    LengthStringFormatter formatter = new LengthStringFormatter(lengthParser.getValue(),
        lengthParser.getFromUnit(), result, lengthParser.getToUnit());
    System.out.println(formatter.format());

  }
}