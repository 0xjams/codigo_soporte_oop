package me.jorgemoran.semana8.converter;

interface ConversionStrategy {
    double convert(double value);
    String getFromUnit();
    String getToUnit();
}
