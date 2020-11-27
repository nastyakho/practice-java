package ru.mirea.exercise21and22.ex3;

public interface ICreateDocument {
    IDocument CreateNew();
    IDocument CreateOpen(IDocument doc);
}
