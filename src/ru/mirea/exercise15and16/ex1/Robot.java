package ru.mirea.exercise15and16.ex1;

public class Robot
{
    public static void main(String[] args) {
        Controller controller = new Controller();
        Thread l = new Thread(new LeftLeg(controller));
        Thread r = new Thread(new RightLeg(controller));
        l.start();
        r.start();
    }
}