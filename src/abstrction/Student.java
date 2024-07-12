package abstrction;

public class Student extends Person {

    @Override
    public void dance() {
        System.out.printf("Dance method...");
    }

    //    @Override
    public void run() {
        System.out.printf("run method in student ....");
    }
}
