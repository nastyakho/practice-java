package ru.mirea.exercise17and18.ex2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Two {

    static Scanner inw = new Scanner(System.in);

    public static void main(String[] args) {
        while (true)
            System.out.println((Pattern.matches("([a-fA-F0-9]+):([a-fA-F0-9]+):([a-fA-F0-9]+):([a-fA-F0-9]+):([a-fA-F0-9]+):([a-fA-F0-9]+)", inw.next()) ? "П" : "Неп") + "равильное выражение");
    }
}
