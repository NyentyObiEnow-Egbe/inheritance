package models.animal;

public class Bird extends Animal {


    void fly() {
        System.out.println(name);
//        run(); //Fail
        sleep();
        wakeUp();
        eat();
    }

}
