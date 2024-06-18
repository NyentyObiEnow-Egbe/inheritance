
public class Teacher extends Person {
    String teacherId;

    Teacher() {
        super();
    }

    Teacher(String email, String phoneNumber, String name, String surName, String middleName, int age, String address, String teacherId) {
        super(email, phoneNumber, name, surName, middleName, age, address);
        this.teacherId = teacherId;
    }

    @Override
    void display() {
        System.out.println("display method in Teacher");
    }

    void markExams() {
        System.out.println("markExams method in Teacher");
    }
}
