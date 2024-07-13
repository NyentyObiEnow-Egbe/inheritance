package abstrction.main;

import abstrction.Person;
import abstrction.Student;
//import abstrction.*;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();

//        Person person = new Person();
        Person person = new Student();
        student.dance();
    }
}
