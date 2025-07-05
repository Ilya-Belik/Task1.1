package org.example;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Иван Иванов", 30);
        Student student = new Student("Петр Петров", 20, "МГУ");

        System.out.println(person);
        System.out.println(student);
    }
}