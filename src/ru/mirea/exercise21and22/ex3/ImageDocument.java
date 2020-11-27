package ru.mirea.exercise21and22.ex3;

public class ImageDocument implements IDocument {

    @Override
    public void open() {
        System.out.println("ImageDocument opened");
    }

    @Override
    public void nw() {
        System.out.println("ImageDocument created");
    }
}
