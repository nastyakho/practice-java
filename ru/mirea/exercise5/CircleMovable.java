package ru.mirea.exercise5;

public class CircleMovable extends Circle implements Movable {
    public CircleMovable(Point center, double radius)
    {
        super(center, radius);
    }

    @Override
    public void move(int x, int y) {
        Point ds = this.getCenter();
        this.setCenter(new Point(ds.getX() + x, ds.getY() + y));
    }
}
