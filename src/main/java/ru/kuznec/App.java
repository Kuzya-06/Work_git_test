package ru.kuznec;

import ru.kuznec.entity.Student;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello Misha !!!");
        Student student = new Student(1,"Bob", 56);
        System.out.println(student);
    }
}
