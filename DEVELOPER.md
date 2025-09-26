# Developer Guide

## Get Started

Developers need to install Java version 21.

```bash
# Ubuntu/Debian
sudo apt update && sudo apt install openjdk-21-jdk

# macOS (Homebrew)
brew install openjdk@21

# Windows
- Download from https://www.oracle.com/java/technologies/downloads/
# Or use Package Manager
choco install openjdk21
```

## Testing

The project is using **JUnit** for automated tests. Run this command to run the tests:

```bash
./gradlew test
```

## Build Configuration

- Junit 5.11.0
- Checkstyle 10.12.4

## Code Style

The project is using Google checkstyle. The only modification I've done is to remove the need for JavaDoc on every method. If you want specifics, check **build.gradle**.

## Future For The Module

If you've come this far, I want to tell you about my visions for the module.
The module is to supposed to be flexible and versatile, parsing user inputs and convert different units to get the correct output.

**Unit Conversions**: Right now the module is using some units but not that many, this could be extended to using more units and a larger variety of units.

**Further addition of tests**: At the time writing this documentation, I have 37 tests. It doesn't cover all methods and not all conversions. To make sure all conversions and methods work as intended, everything should be included in the automated tests. Also adding edge cases, faulty inputs etc.

**Parsing**: The more natural language a user can type in, the better the parser is.
Adding more functionality and more flexibility to it should make it better for users and therefore is a priority.
