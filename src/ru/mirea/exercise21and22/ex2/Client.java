package ru.mirea.exercise21and22.ex2;

import ru.mirea.Prakt2122.exercise1.TypesComplex;

import java.util.Scanner;

public class Client {

    Chair[] vyb = {new VikChair(), new MultiChair(), new MagicChair()};

    public Client() {
        Scanner inw = new Scanner(System.in);
        System.out.println("Какой стул выберешь:\n0 - Викторианский стул;\n" +
                "1 - Многофункциональный стул;\n" +
                "2 - Магический стул");
        int ch = inw.nextInt();
        if(ch > -1 && ch < 3)
            sit(vyb[ch]);
        else
            System.out.println("Произошла ошибочка");
    }

    public void sit(Chair chair)
    {
        chair.sit();
    }
}
