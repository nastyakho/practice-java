package ru.mirea.exercise29and30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class SP {
    public static void main(String[] args) throws IOException {
        Comparator<Map.Entry<String, Integer>> c1 = Map.Entry.comparingByValue(Comparator.reverseOrder());
        Comparator<Map.Entry<String, Integer>> c2 = Map.Entry.comparingByKey();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        Stream<String> stream = in.lines().limit(1);
        stream.flatMap(x -> {
            String[] mas = x.replaceAll("[^A-Za-zА-Яа-яёЁ0-9 ]", " ").split(" ");
            if(mas.length < 10)
                System.out.println("Количество элементов: " + mas.length);
            return stream(mas);
        })
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(x -> x, Collectors.summingInt(p -> 1)))
                .entrySet()
                .stream()
                .sorted(c1.thenComparing(c2))
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
