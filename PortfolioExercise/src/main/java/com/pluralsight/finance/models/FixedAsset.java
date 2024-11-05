package com.pluralsight.finance.models;

public abstract class FixedAsset implements Valuable {
    private String name;
    private double marketValue;

    protected FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    public double getValue() {
        return 0;
    }
}
