package ru.mirea.exercise6;

public class RectangleMovable extends Rectangle implements Movable {
    public RectangleMovable(Point center, double diag)
    {
        super(center, diag);
    }

    @Override
    public void move(int x, int y) {
        Point ds = this.getCenter();
        this.setCenter(new Point(ds.getX() + x, ds.getY() + y));
    }
}
