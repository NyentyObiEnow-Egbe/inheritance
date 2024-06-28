package models.person;

public class Teacher extends Person {
    String teacherId;


    @Override
    void display() {
        System.out.println("display method in models.person.Teacher");
    }

    void markExams() {
        System.out.println("markExams method in models.person.Teacher");
    }
}
