package me.jorgemoran.semana8.converter;

public class KilometersToMilesStrategy implements ConversionStrategy {
    public double convert(double km) {
        return km * 0.621371;
    }
    public String getFromUnit() { return "Kilómetros"; }
    public String getToUnit() { return "Millas"; }
}
