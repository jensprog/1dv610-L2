package com.jensprog.unitconverter;

import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;

public class CurrencyConverter {
    private String fromCurrency;
    private String toCurrency;

    public CurrencyConverter(String fromCurrency, String toCurrency) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        if (fromCurrency == null || fromCurrency.isEmpty()) {
            throw new IllegalArgumentException("Currency cannot be null or empty");
        }
        this.fromCurrency = fromCurrency;
    }

    public void setToCurrency(String toCurrency) {
        if (toCurrency == null || toCurrency.isEmpty()) {
            throw new IllegalArgumentException("Currency cannot be null or empty");
        }
        this.toCurrency = toCurrency;
    }

    public int exchangeRateRequest() {
        return 0;
    }

    public BigDecimal convert(BigDecimal amount) {
        return BigDecimal.ZERO; // Placeholder until API integration is implemented
    }
}
