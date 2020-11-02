package ru.mirea.exercise15and16.ex2;

public class Company {
    private String name;
    private int wallet;

    public Company(String name, int wallet) {
        this.name = name;
        this.wallet = wallet;
        System.out.println("Открыт новый счёт. Наименование компании: " + name + " на счету: " + wallet + " руб.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Произошла авторизация " + Thread.currentThread().getName() + " автомата");
        System.out.println("Процесс переименования компании. Старое наименование: " + this.name);
        this.name = name;
        System.out.println("Процесс успешно завершён. Новое наименование: " + name);
        print();
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        System.out.println("Произошла авторизация " + Thread.currentThread().getName() + " автомата");
        System.out.println("Процесс обновления суммы кошелька. Старая сумма: " + this.wallet + " руб.");
        this.wallet = wallet;
        System.out.println("Процесс успешно завершён. Новая сумма: " + wallet + " руб.");
        print();
    }

    public void setWalletm(int wallet) {
        System.out.println();
        System.out.println("Произошла авторизация " + Thread.currentThread().getName() + " автомата");
        System.out.println("Запрос на снятие " + wallet + " руб. На счету: " + this.wallet + " руб.");
        if(wallet > this.wallet)
        {
            System.out.println("Процесс успешно провален.");
            print();
            return;
        }
        this.wallet -= wallet;
        System.out.println("Процесс успешно завершён. Новая сумма: " + this.wallet + " руб.");
        print();
    }

    public void setWalletp(int wallet) {
        System.out.println();
        System.out.println("Произошла авторизация " + Thread.currentThread().getName() + " автомата");
        System.out.println("Запрос на пополнение " + wallet + " руб. На счету: " + this.wallet + " руб.");
        this.wallet += wallet;
        System.out.println("Процесс успешно завершён. Новая сумма: " + this.wallet + " руб.");
        print();
    }

    public void print()
    {
        notifyAll();
        try {
            wait();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", wallet=" + wallet +
                '}';
    }
}