package ru.mirea.exercise19and20;

public class Humer {
    private String A, B, C, RS = "";
    private int N, R;
    private String[] reg = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};

    public Humer() {
        A = reg[(int)(Math.random()*11)];
        B = reg[(int)(Math.random()*11)];
        C = reg[(int)(Math.random()*11)];
        N = (int)(Math.random()*9);
        R = (int)(Math.random()*198) + 1;
        if (R < 10)
            RS = "0";
        RS += Integer.toString(R);
    }

    @Override
    public String toString() {
        return A + N + N + N + B + C + RS;
    }
}
