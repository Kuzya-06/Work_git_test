package ru.kuznec;

import ru.kuznec.entity.Student;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello Misha !!!");
        Student student = new Student(1,"Bob", 56);
        Student student2 = new Student(2,"Henry", 14);
        Student student3 = new Student(3,"Tom", 4);
        System.out.println(student);
         System.out.println(student2);
        System.out.println(student3);
    }
}
