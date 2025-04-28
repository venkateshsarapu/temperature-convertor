package com.example.converter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TemperatureConverterTest {

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0), 0.0001);
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100), 0.0001);
        assertEquals(98.6, TemperatureConverter.celsiusToFahrenheit(37), 0.0001);
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32), 0.0001);
        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212), 0.0001);
        assertEquals(37.0, TemperatureConverter.fahrenheitToCelsius(98.6), 0.0001);
    }
}
