# Unit Converter String Parser Module

## Getting started

### Prerequisites

In your Java project, add these to your build

**Gradle**:

```bash
repositories {
    mavenCentral()
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.jensprog:1dv610-L2:v1.0.0'
}
```

**Maven**:

```bash
  <repositories>
      <repository>
          <id>jitpack.io</id>
          <url>https://jitpack.io</url>
      </repository>
  </repositories>

  <dependency>
      <groupId>com.github.jensprog</groupId>
      <artifactId>1dv610-L2</artifactId>
      <version>v1.0.0</version>
  </dependency>
```

**Manual JAR Download**:

- Download the JAR from: <https://jitpack.io/com/github/jensprog/1dv610-L2/v1.0.0/1dv610-L2-v1.0.0.jar>
- Add to your classpath manually

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

## Badges

[![JitPack](https://jitpack.io/v/jensprog/1dv610-L2.svg)](https://jitpack.io/#jensprog/1dv610-L2)

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
