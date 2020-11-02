package ru.mirea.exercise15and16.ex2;

public class ATM2 implements Runnable {

    private final Company res;

    public ATM2(Company res) {
        this.res = res;
    }

    @Override
    public void run() {
        synchronized (res) {
            while (true) {
                switch ((int)(Math.random()*2)+1)
                {
                    case 1:
                        res.setWalletm((int)(Math.random() * 100000));
                        break;
                    case 2:
                        res.setWalletp((int)(Math.random() * 1000));
                }
            }
        }
    }
}