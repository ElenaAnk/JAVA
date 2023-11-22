package org.example.sem.cw.cw6.convert;

public class KelConverter implements Converter{
    @Override
    public double convertValue(double baseValue) {
        return baseValue+273.15;
    }
}
