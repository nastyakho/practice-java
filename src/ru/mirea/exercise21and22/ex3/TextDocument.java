package ru.mirea.exercise21and22.ex3;

public class TextDocument implements IDocument {

    @Override
    public void open() {
        System.out.println("TextDocument opened");
    }

    @Override
    public void nw() {
        System.out.println("TextDocument created");
    }
}
