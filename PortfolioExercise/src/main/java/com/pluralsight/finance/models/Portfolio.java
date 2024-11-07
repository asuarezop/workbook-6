package com.pluralsight.finance.models;

import java.util.List;

public class Portfolio implements Valuable {
    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public void add(Valuable a) {}

    @Override
    public double getValue() {
        return 0;
    }

    public void getMostValuable() {}
    public void getLeastValuable() {}
}
