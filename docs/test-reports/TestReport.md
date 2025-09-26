# Test Report

| What was tested                              | How it was tested                                                          | Test Result |
| -------------------------------------------- | -------------------------------------------------------------------------- | ----------- |
| Token Creation - Number                      | Verified that Token objects are created correctly with numeric values      | ✅ PASSED    |
| Token Creation - Unit                        | Checked that Token objects can handle unit strings                         | ✅ PASSED    |
| Token Creation - Word                        | Verified that regular words are tokenized correctly                        | ✅ PASSED    |
| Token Creation - EOF                         | Checked that end of input is handled correctly                             | ✅ PASSED    |
| TokenType Values                             | Verified that all TokenType enum values work correctly                     | ✅ PASSED    |
| Tokenizer.scanTokens()                       | Checked that input strings are tokenized into correct Token lists          | ✅ PASSED    |
| UnitConversionQueryParser.parse()            | Verified that natural language is parsed into value, from-unit and to-unit | ✅ PASSED    |
| UnitConversionQueryFormatter.format()        | Checked that conversion results are formatted correctly for display        | ✅ PASSED    |
| LengthConverter - Meter to Centimeter        | Verified conversion 1 meter = 100 centimeters                              | ✅ PASSED    |
| LengthConverter - Millimeter to Centimeter   | Checked conversion between smaller length units                            | ✅ PASSED    |
| LengthConverter - Meter to Meter             | Verified that same unit returns original value                             | ✅ PASSED    |
| LengthConverter - Millimeter to Meter        | Checked conversion from smaller to larger unit                             | ✅ PASSED    |
| LengthConverter - Centimeter to Millimeter   | Verified conversion 1 cm = 10 mm                                           | ✅ PASSED    |
| LengthConverter - Centimeter to Meter        | Checked conversion 100 cm = 1 meter                                        | ✅ PASSED    |
| LengthConverter - Meter to Millimeter        | Verified conversion 1 meter = 1000 mm                                      | ✅ PASSED    |
| LengthConverter - Inch to Kilometer          | Checked conversion between imperial and metric units                       | ✅ PASSED    |
| LengthConverter - Kilometer to Inch          | Verified reverse conversion between different unit systems                 | ✅ PASSED    |
| SpeedConverter - Km/h to m/s                 | Checked conversion from km/h to m/s                                        | ✅ PASSED    |
| SpeedConverter - Km/h to mph                 | Verified conversion between metric and imperial speed units                | ✅ PASSED    |
| SpeedConverter - mph to m/s                  | Checked conversion from imperial to metric units                           | ✅ PASSED    |
| SpeedConverter - m/s to km/h                 | Verified reverse conversion from m/s to km/h                               | ✅ PASSED    |
| SpeedConverter - m/s to mph                  | Checked conversion from metric to imperial units                           | ✅ PASSED    |
| SpeedConverter - mph to km/h                 | Verified conversion from imperial to metric units                          | ✅ PASSED    |
| TemperatureConverter - Fahrenheit to Kelvin  | Checked temperature conversion with absolute scale                         | ✅ PASSED    |
| TemperatureConverter - Fahrenheit to Celsius | Verified conversion between most common temperature scales                 | ✅ PASSED    |
| TemperatureConverter - Celsius to Fahrenheit | Checked reverse temperature conversion                                     | ✅ PASSED    |
| TemperatureConverter - Celsius to Kelvin     | Verified conversion from Celsius to absolute scale                         | ✅ PASSED    |
| TemperatureConverter - Kelvin to Fahrenheit  | Checked conversion from absolute scale to Fahrenheit                       | ✅ PASSED    |
| TemperatureConverter - Kelvin to Celsius     | Verified conversion from absolute scale to Celsius                         | ✅ PASSED    |
| UnitWordTransformer - Pluralize              | Checked that units are pluralized correctly (meter→meters, km/h→km/h)      | ✅ PASSED    |
| UnitWordTransformer - Singularize            | Verified that plural units are singularized correctly                      | ✅ PASSED    |
| VolumeConverter - Cubic Meter to Cubic Foot  | Checked volume conversion between metric and imperial units                | ✅ PASSED    |
| VolumeConverter - Gallon to Liter            | Verified conversion between common volume units                            | ✅ PASSED    |
| VolumeConverter - Liter to Milliliter        | Checked conversion within metric volume units                              | ✅ PASSED    |
| WeightConverter - Kilogram to Gram           | Verified weight conversion 1 kg = 1000 grams                               | ✅ PASSED    |
| WeightConverter - Kilogram to Kilogram       | Checked that same weight unit returns original value                       | ✅ PASSED    |
| WeightConverter - Kilogram to Pound          | Verified conversion between metric and imperial weight units               | ✅ PASSED    |

Every test passes but the tests are quite simple and doesn't test edge cases or faulty inputs. The test proves that the core functionality works as intended.
Could be improved with better testing for invalid inputs, typos, incompatible units etc.

I have not included all conversions in my tests, it would be the most optimal way to do it but it would take a lot of time, included what I stated in the earlier sentences. Unfortunatly I have to wrap things up before deadline.
