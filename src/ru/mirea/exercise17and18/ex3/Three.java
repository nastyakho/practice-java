package ru.mirea.exercise17and18.ex3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Three {
    public static void main(String[] args) {
        System.out.println("Список цен:");
        String[] inp = new String[]{"23.78 USD", "22 UDD", "0.002 USD", "139.90 RUR", "99.90 RUR", "99 RUR"};
        for (String f : inp)
            System.out.println(f);
        System.out.println();
        Pattern pattern = Pattern.compile("^[0-9]*.[0-9]{2} (USD|RUR|EU)$", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher("");
        System.out.println("Верифицированный список цен:");
        for (String f : inp) {
            matcher.reset(f);
            System.out.println(matcher.find() ? matcher.group() : "Цена неверна");
        }
    }
}
