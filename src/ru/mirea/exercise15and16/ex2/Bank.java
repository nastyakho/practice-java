package ru.mirea.exercise15and16.ex2;

public class Bank {
    public static void main(String[] args) {
        Company company = new Company("СТД «Петрович»", 50000);
        new Thread(new ATM1(company), "с первого").start();
        new Thread(new ATM2(company), "со второго").start();
        new Thread(new ATM3(company), "с третьего").start();
    }
}
