package ru.mirea.exercise21and22.ex1;

public class DivComplex implements Complex{
    @Override
    public void start() {
        System.out.println("Новое комплексное число: z = " + rnd() + " / " + rnd() + "i");
    }

    public int rnd()
    {
        return (int)(Math.random()*10);
    }
}