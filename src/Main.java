
public class Main {

    public static void main(String[] args) {
        Person persons[] = new Person[4];

        Person person = new Student("st@gmai.com", "Jen 1", "James", "jen", "Jame", 12, "jame", "1234");
//        person.display();
        persons[0] = person;

        Person person1 = new Teacher();
//        person1.display();
        persons[1] = person1;

        /////////&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& polymorphism
        Person person2 = new Student(); // ( polymorphic references (person2, person, person1))

//        System.out.println(person2.studentId);
//        person2.attendClasses(); // does not belong to Person so we need to cast person2 to Student
        person2.display();
        Student student = (Student) person2;
//        Animal animal = (Animal) person2; // Will fail to compile as there is not relationship
        student.attendClasses();
        System.out.println(student.studentId);
        // person.display(90);
        // Student student =  (Student) person;
        //  System.out.println(student.studentId);
        // student.display();
        // student.display(90);
    }

}
