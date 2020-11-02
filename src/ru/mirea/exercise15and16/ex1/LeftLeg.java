package ru.mirea.exercise15and16.ex1;

public class LeftLeg implements Runnable {

    private final Controller res;

    public LeftLeg(Controller res) {
        this.res = res;
    }

    @Override
    public void run() {
        synchronized (res) {
            while (true) {
                System.out.println("Left");
                res.print();
            }
        }
    }
}