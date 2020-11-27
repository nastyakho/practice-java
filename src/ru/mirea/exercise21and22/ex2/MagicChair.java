package ru.mirea.exercise21and22.ex2;

public class MagicChair implements Chair{
    @Override
    public void sit() {
        System.out.println("Пользователь сел на магический стул");
    }
}