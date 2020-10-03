package ru.mirea.Prakt6;

public class Rectangle {
    private Point center;
    private double diag;

    public Rectangle(Point center, double diag) {
        this.center = center;
        this.diag = diag;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getDiag() {
        return diag;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "center=" + center +
                ", diag=" + diag +
                '}';
    }
}
