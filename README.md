# Unit Converter Module

## Installation

Users need **Java version 17+ for Gradle 9.0.0**. When you clone the repo and the first time you run a ./gradlew command you will get the Gradle version 9.0.0 since the wrapper files are in the repository.

```bash
# Example of a gradle command
  ./gradlew test
```

## Exchange Rate API Configuration

The default API this module uses is <https://exchangerate.host>

```java
ExchangeRateProvider exchangeRateProvider = new ExchangeRateProvider();
```

You can also use an API of your choice as long as it returns JSON data.

```java
ExchangeRateProvider exchangeRateProvider = new ExchangeRateProvider("https://your-api.com/latest");
```

To be able to use the conversion between currencies with the default API you'll need to visit <https://exchangerate.host> and create an account in order to receive your free API key.
You can extend the number of requests to the API by upgrading the subscription. Note that this is only necessary if you're going to use the currency conversion, you can find more information regarding what the API can do through the Github repository <https://github.com/Formicka/exchangerate.host/blob/master/README.md>.

## Environment Variables

To use the currency conversion you'll need to add the following environment variable in a .env-file

`API_KEY`

## Dependencies

To use this module you need to add **dotenv-java** to the **build.gradle** dependencies. Since you need to have a environment variable for the API-key.

## License

[MIT](https://choosealicense.com/licenses/mit/)
