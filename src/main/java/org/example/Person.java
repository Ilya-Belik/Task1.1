package org.example;

public class Person {
    private String name;

    private int age;

    // Конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Имя человека: " + name + ", Его возраст: " + age;
    }
}