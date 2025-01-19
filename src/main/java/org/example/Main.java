package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Person person = new Person("Ahmet", "Güven", 32);
        Person person1 = new Person("Furkan", "Güven", 7,
                "Kütahya", "Black", true);
        System.out.println(person.getFirstName());
        System.out.println(person.isTeen());


        Wall wall = new Wall(7,8);
        wall.setHeight(-10);
        System.out.println(wall.getHeight());
    }

}
