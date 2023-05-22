package io.zipcoder.interfaces;

public class TestPerson {
    public static void main(String[] args) {
        testConstructor();
        testSetName();
    }

    public static void testConstructor() {
        Person person = new Person(1L, "John Doe");
        System.out.println("ID: " + person.getId());
        System.out.println("Name: " + person.getName());
    }

    public static void testSetName() {
        Person person = new Person(1L, "John Doe");
        System.out.println("Before setting name: " + person.getName());

        person.setName("Jane Smith");
        System.out.println("After setting name: " + person.getName());
    }
}

