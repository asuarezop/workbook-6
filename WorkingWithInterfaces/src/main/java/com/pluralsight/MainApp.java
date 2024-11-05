package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        //Best practice - when declaring a Collection as a List, you have more flexibility in changing what kind of list it is (ArrayList or LinkedList)
        List<Person> people = new ArrayList<>();
        Person protagonist = new Person("Walter", "White", 52);
        Person antagonist = new Person("Gustavo", "Fring", 57);
        Person sideKick = new Person("Jesse", "Pinkman", 28);

        people.add(protagonist);
        people.add(antagonist);
        people.add(sideKick);

        System.out.println("First Name|" + "Last Name|" + "Age");
        Collections.sort(people);
        Collections.reverse(people);

        for (Person p: people) {
            System.out.println(p);
        }
    }
}
