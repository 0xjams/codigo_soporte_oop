package me.jorgemoran.semana8.converter;

public class CelsiusToFarenheitStrategy implements ConversionStrategy {
    public double convert(double celsius) {
        return (celsius * 9/5) + 32;
    }
    public String getFromUnit() { return "Celsius"; }
    public String getToUnit() { return "Fahrenheit"; }
}
