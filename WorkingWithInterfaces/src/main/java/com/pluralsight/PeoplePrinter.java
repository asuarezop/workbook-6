package com.pluralsight;

import java.util.function.Consumer;

public class PeoplePrinter implements Consumer<Person> {
    @Override
    public void accept(Person p) {
        System.out.println(p);
    }
}
