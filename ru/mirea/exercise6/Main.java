package ru.mirea.Prakt6;

public class Main {

    public void main() {

        Rectangle rect = new Rectangle(new Point(1,1), 10f);
        System.out.println(rect);
        RectangleMovable pointMovable = new RectangleMovable(rect.getCenter(),10);
        pointMovable.move(12,19);
        System.out.println(pointMovable);
    }
}
