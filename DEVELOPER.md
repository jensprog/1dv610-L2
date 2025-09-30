# Developer Guide

## Get Started

```bash
git clone https://github.com/jensprog/1dv610-L2.git
```

Developers need to install Java version 21.

```bash
# Ubuntu/Debian
sudo apt update && sudo apt install openjdk-21-jdk
```

```bash
# macOS (Homebrew)
brew install openjdk@21
```

```bash
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

**Unit Conversions**: Right now the module is using some units but not that many, this could be extended to using more units and a larger variety of those units.
I had a plan to implement currency conversion, using API to fetch up-to-date exchange rate. But the free API keys gave only 100 requests per month, payment is necessary to gain more requests. I'm not willing to spend that money on my module, right now atleast.

Some unit conversions are using too many floating points, (see example in readme kilometers -> miles) that should be changed since it's not necessary to be that precise.

**Further addition of tests**: At the time writing this documentation, I have 37 tests. It doesn't cover all methods and not all conversions. To make sure all conversions and methods work as intended, everything should be included in the automated tests. Also adding edge cases, faulty inputs etc.

**Parsing**: The more natural language a user can type in, the better the parser is.
Adding more functionality and more flexibility to it should make it better for users and therefore is a priority.

**Summary**: To check what I believe needs to be done, visit [Github Issues](https://github.com/jensprog/1dv610-L2/issues)
