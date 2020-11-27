package ru.mirea.exercise21and22.ex3;

public class CreateTextDocument implements ICreateDocument{
    @Override
    public IDocument CreateNew() {
        return new TextDocument();
    }

    @Override
    public IDocument CreateOpen(IDocument doc) {
        doc.open();
        return doc;
    }
}
