package com.sda.javaoop.person;


import java.util.Objects;

public class Person {


    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private boolean isAdult;

    public Person() {

    }

    public Person(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.isAdult = isAdult(age);

    }

    private boolean isAdult(int age) {
        if (age >= 18) {
            return true;
        }
        return false;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public boolean isRetired() {
        if ("FEMALE".equalsIgnoreCase(gender))
            return this.age > 65;
        else if ("MALE".equalsIgnoreCase(gender)) {
            return this.age > 67;
        } else
            return false;
    }


    @Override
    public String toString(){
        return "Person : First Name: " + firstName + " Last Name: " + lastName
                + " Age: " + age + " Gender: " + gender;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && isAdult == person.isAdult && Objects.equals(firstName, person.firstName)
                && Objects.equals(lastName, person.lastName) && Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, gender);
    }
}
