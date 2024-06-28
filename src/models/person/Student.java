package models.person;

public class Student extends Person {
    String studentId;

    Student() {
        super();
        email = "student@gmail.com";
    }

    Student(String email, String phoneNumber, String name, String surName, String middleName, int age, String address, String studentId) {
        super(email, phoneNumber, name, surName, middleName, age, address);
//        this();
        this.studentId = studentId;
    }


    void display() {
        System.out.println("display method in models.person.Student");
        System.out.println(email);
        System.out.println(phoneNumber);
        System.out.println(name);
        System.out.println(surName);
        System.out.println(age);
        System.out.println(studentId);
        System.out.println(middleName);
    }
    void display(Student [] students) {
        System.out.println("Display an array of students");
    }

    void display(int age) {
        System.out.println("Display students int age");
    }

    void attendClasses() {
        System.out.println("attendClasses method in models.person.Student");
    }
}
