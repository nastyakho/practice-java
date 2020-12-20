package ru.mirea.exercise7;

public abstract class Dish {
    //Кроме обычных классов в Java есть абстрактные классы.
    // Абстрактный класс похож на обычный класс. В абстрактном классе также можно определить поля и методы, но в то же время нельзя создать объект или экземпляр абстрактного класса.
    // Абстрактные классы призваны предоставлять базовый функционал для классов-наследников. А производные классы уже реализуют этот функционал.
    int radius;
    int deep;
    double volume;

    public void calcVolume(){}

}
