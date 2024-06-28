package models.animal;

public class Animal {

    private String devBy = "Onowu";

    protected String name;
    String type;


    private void run() {
        System.out.println("Animal is running");
    }

    void sleep() {
        this.run();
        System.out.println("Animal sleep");
    }

    protected void wakeUp() {
        System.out.println("Animal wakeUp");
    }

    public void eat() {
        System.out.println("Animal eat");
    }
}
