# Unit Converter String Parser Module

## Usage

The **String Parser** is used to convert different units in a more natural language using user input.

```java
// Example showing conversions with only value and units and with natural language involved
package com.jensprog;

import com.jensprog.formatter.UnitConversionQueryFormatter;
import com.jensprog.parser.UnitConversionQueryParser;
import com.jensprog.unitconverter.UnitConversionService;

public class App {
  public static void main(String[] args) {
    UnitConversionQueryParser parser = new UnitConversionQueryParser("15.5 kilometers to miles");
    // Or "I want to know how far 15.5 kilometers is in miles"
    // Or "What is 2 cups in liters?"
    double value = parser.getValue(); // 15.5
    String fromUnit = parser.getFromUnit(); // "kilometers"
    String toUnit = parser.getToUnit(); // "miles"

    UnitConversionService service = new UnitConversionService();
    double result = service.convert(value, fromUnit, toUnit);

    UnitConversionQueryFormatter formatter = new UnitConversionQueryFormatter(
        value, fromUnit, result, toUnit);
    System.out.println(formatter.format());
  }
}
```

```bash
# Output
15.5 kilometers is 9.631277418072004 miles
```

## Reflections

[Reflections](docs/Reflections.md)

## Test Report & Unit Test Screenshot

```bash
# How to run all unit tests
./gradlew test
```

- [TestReport](docs/test-reports/TestReport.md)
- [AutomatedTests](docs/images/ModuleTests.png)

## Contributing

- [Developer.md](DEVELOPER.md)

## License

[MIT](https://choosealicense.com/licenses/mit/)
