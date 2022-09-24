package com.sda.javaoop.person;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setFirstName("Jan");
        person1.setLastName("Kowalski");
        person1.setAge(354);
        person1.setGender("Male");

        Person person2 = new Person();

        person2.setFirstName("Jan");
        person2.setLastName("Kowalski");
        person2.setAge(34);
        person2.setGender("Male");

        Person person3 = new Person("Jolanta", "Kowalska", 29, "Female");


        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
        System.out.println(person2.equals(person3));

        System.out.println("P1 Hash: " + person1.hashCode());
        System.out.println("P2 Hash: " + person2.hashCode());
        System.out.println("P3 Hash: " + person3.hashCode());

    }

}
