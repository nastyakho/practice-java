package ru.mirea.exercise19and20;
import java.util.*;

public class Generator {

    Scanner inw = new Scanner(System.in);
    String nomer;
    ArrayList<String> baza = new ArrayList<>();
    HashSet<String> baza1 = new HashSet<>();
    TreeSet<String> baza2 = new TreeSet<>();
    long start, end;
    boolean rez;

    public Generator() {
        System.out.println("Рандомный красивый автомобильный номер: ");
        int num = (int)(Math.random()*2000000);
        for(int i = 0; i < 2000000;i++)
        {
            String d = new Humer().toString();
            baza.add(d);
            baza1.add(d);
            baza2.add(d);
        }
        nomer = baza.get(num);
        System.out.println(nomer);
        System.out.println("База данных заполненна");
        poisk();
    }

    private void poisk()
    {
        while (true) {
            System.out.println("Введите номер:");
            nomer = inw.next();
            System.out.println("Запускаем поиск");
            met(baza, nomer, "Поиск перебором: ");
            start = System.nanoTime();
            Collections.sort(baza);
            rez = Collections.binarySearch(baza, nomer) >= 0;
            end = System.nanoTime();
            System.out.println("Бинарный поиск: " + (rez ? "номер найден" : "не найден") + ", поиск занял " + (end - start) + "нс");
            met(baza1, nomer, "Поиск в HashSet: ");
            met(baza2, nomer, "Поиск в TreeSet: ");
        }
    }

    private void met(AbstractCollection<String> baz, String nume, String name)
    {
        start = System.nanoTime();
        rez = baz.contains(nume);
        end = System.nanoTime();
        System.out.println(name + (rez ? "номер найден" : "не найден") + ", поиск занял " + (end - start) + "нс");
    }
}
