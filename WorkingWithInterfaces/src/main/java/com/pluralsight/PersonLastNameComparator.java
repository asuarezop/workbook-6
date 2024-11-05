package com.pluralsight;

import java.util.Comparator;

public class PersonLastNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        String p1LastName = p1.getLastName();
        String p2LastName = p2.getLastName();

        return p1LastName.compareToIgnoreCase(p2LastName);
    }
}
