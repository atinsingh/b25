package io.pragra.b25.inherritance;

public class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void display() {
        System.out.println("Name is -> " + name);
        System.out.println("Age is  -> " + age);
    }

    public void changeName(String name) {
        this.name = name;
    }
}
