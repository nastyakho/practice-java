package ru.mirea.Prakt5;

public class Main {

    public void main() {

        Circle circle = new Circle(new Point(1,1), 10f);
        System.out.println(circle);
        PointMovable pointMovable = new PointMovable(10,10);
        System.out.println(pointMovable);
        pointMovable.move(12,19);
        System.out.println(pointMovable);
    }
}
