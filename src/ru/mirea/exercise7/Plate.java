package ru.mirea.Prakt7;

public class Plate extends Dish{

    public Plate(int radius, int deep) {
        this.radius = radius;
        this.deep = deep;
        calcVolume();
    }

    //Производный класс обязан переопределить и реализовать все абстрактные методы, которые имеются в базовом абстрактном классе.
    // Также следует учитывать, что если класс имеет хотя бы один абстрактный метод, то данный класс должен быть определен как абстрактный.
    @Override
    public void calcVolume() {
        volume = radius * deep;
    }
}
