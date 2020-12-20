package ru.mirea.exercise7;

import java.util.ArrayList;

public class Main {
    public void main(){
        Plate plate = new Plate(1,10);
        Dish pan = new Pan(20,100);
        plate.calcVolume();
        pan.calcVolume();
        ((Pan)pan).makeBorsh();
        System.out.println("Volume plate: " + plate.volume);
        System.out.println("Volume pan: " + pan.volume);
        ArrayList<Dish> allDishes = new ArrayList<>();
        allDishes.add(plate);
        allDishes.add(pan);
        Dog german = new GSD(7, 30, 60);
        Dog bobik = new Spitz(3, 10, 15);
        german.golos();
        bobik.golos();
        ((GSD)german).protect();
        ((Spitz)bobik).on_hands();
        ArrayList<Dog> allDogs = new ArrayList<>();
        allDogs.add(german);
        allDogs.add(bobik);
    }
}
