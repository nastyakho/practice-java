package ru.mirea.exercise21and22.ex3;

public class Carcas {

    ICreateDocument cr;
    private IDocument doc;
    public void nwT()
    {
        System.out.println("new...");
        cr = new CreateTextDocument();
        doc = cr.CreateNew();
        doc.nw();
    }

    public void nwI()
    {
        System.out.println("new...");
        cr = new CreateImageDocument();
        doc = cr.CreateNew();
        doc.nw();
    }

    public void nwM()
    {
        System.out.println("new...");
        cr = new CreateMusicDocument();
        doc = cr.CreateNew();
        doc.nw();
    }

    public void open()
    {
        System.out.println("open...");
        if(doc != null)
            cr.CreateOpen(doc);
        else
            System.out.println("Вы ещё не создали документа");
    }

    public void save()
    {
        System.out.println("save...");
    }

    public void exit()
    {
        System.out.println("exit...");
    }

}
