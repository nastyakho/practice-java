package ru.mirea.exercise7;

public class GSD extends Dog{

    public GSD(int age, int mass, int height) {
        this.age = age;
        this.mass = mass;
        this.height = height;
    }

    @Override
    public void golos() {
        System.out.println("Woof");
    }

    public void protect()
    {
        System.out.println("Овчарка защищается");
    }
}