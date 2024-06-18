
public class Teacher extends Person {
    String teacherId;


    @Override
    void display() {
        System.out.println("display method in Teacher");
    }

    void markExams() {
        System.out.println("markExams method in Teacher");
    }
}
