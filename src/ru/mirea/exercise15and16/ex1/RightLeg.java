package ru.mirea.exercise15and16.ex1;


public class RightLeg implements Runnable {

    private final Controller res;

    public RightLeg(Controller res) {
        this.res = res;
    }

    @Override
    public void run() {
        synchronized (res) {
            while (true) {
                System.out.println("Right");
                res.print();
            }
        }
    }
}