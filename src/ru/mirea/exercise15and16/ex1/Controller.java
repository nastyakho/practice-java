package ru.mirea.exercise15and16.ex1;

public class Controller {

    public void print() {
        notify();
        try {
            wait();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
