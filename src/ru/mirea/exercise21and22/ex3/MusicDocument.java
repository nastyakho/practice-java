package ru.mirea.exercise21and22.ex3;

public class MusicDocument implements IDocument{
    @Override
    public void open() {
        System.out.println("MusicDocument opened");
    }

    @Override
    public void nw() {
        System.out.println("MusicDocument created");
    }
}
