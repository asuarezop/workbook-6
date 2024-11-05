package com.pluralsight;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        int p1Age = p1.getAge();
        int p2Age = p2.getAge();

        return Integer.compare(p1Age, p2Age);
    }
}