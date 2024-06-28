package models.person;

public class Person {
    String email = "per@gmail.com";
    String phoneNumber;
    String name;
    String surName;
    String middleName;
    int age = 26;
    String address;

    Person() {
//        super();
        System.out.println("person constructor invoke");
    }

    Person(String email, String phoneNumber, String name, String surName, String middleName, int age, String address) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.surName = surName;
        this.middleName = middleName;
        this.age = age;
        this.address = address;
    }

    void run() {
        System.out.println("models.person.Person is running");
    }


    void display() {
        System.out.println("display method in person");
    }

}
