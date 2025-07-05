package org.example;

public class Student extends Person {

    private String university;

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    @Override
    public String toString() {
        return "Имя студента: " + getName() +
                ", возраст студента: " + getAge() +
                ", обучается в: " + university;
    }
}