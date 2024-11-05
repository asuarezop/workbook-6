package com.pluralsight;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {

        return String.format("%-11s%-10s%-10s\n", firstName, lastName, age);
    }


    @Override
    public int compareTo(Person o) {
        if (o != null) {
            if (this.age < o.getAge()) {
                return -1;
            } else if (this.age > o.getAge()) {
                return 1;
            }
        }

        return 0;
    }
}
