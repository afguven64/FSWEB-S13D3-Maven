package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String address;
    String hairColor;
    boolean glasses;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName, String lastName, int age, String address, String hairColor, boolean glasses) {
        this(firstName, lastName, age);
        this.address = address;
        this.hairColor = hairColor;
        this.glasses = glasses;
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
    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}
