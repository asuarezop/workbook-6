package com.pluralsight.finance.models;

import java.util.ArrayList;

public class Portfolio implements Valuable {
    private String name;
    private String owner;
    private ArrayList<Asset> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public void add(Asset a) {

    }

    @Override
    public double getValue() {
        return 0;
    }
}
