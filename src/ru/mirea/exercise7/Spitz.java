package ru.mirea.Prakt7;

public class Spitz extends Dog {

    public Spitz(int age, int mass, int height) {
        this.age = age;
        this.mass = mass;
        this.height = height;
    }

    @Override
    public void golos() {
        System.out.println("Woof");
    }

    public void on_hands()
    {
        System.out.println("Шпиц залез на руки");
    }
}