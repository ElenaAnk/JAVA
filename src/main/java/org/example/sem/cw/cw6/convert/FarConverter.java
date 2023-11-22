package org.example.sem.cw.cw6.convert;

public class FarConverter implements Converter{
    @Override
    public double convertValue(double baseValue) {
        return baseValue*1.8 + 32;
    }
}
