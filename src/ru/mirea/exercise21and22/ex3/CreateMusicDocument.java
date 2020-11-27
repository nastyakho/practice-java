package ru.mirea.exercise21and22.ex3;

public class CreateMusicDocument implements ICreateDocument{
    @Override
    public IDocument CreateNew() {
        return new MusicDocument();
    }

    @Override
    public IDocument CreateOpen(IDocument doc) {
        doc.open();
        return doc;
    }
}
