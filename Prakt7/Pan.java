package ru.mirea.Prakt7;

public class Pan  extends  Dish{

    public Pan(int radius, int deep) {
        this.radius = radius;
        this.deep = deep;
    }

    @Override
    public void calcVolume() {
        volume =  radius* deep* 10;
    }

    public void makeBorsh(){
        System.out.println("Borsh svaren");
    }

}
