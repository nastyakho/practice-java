package ru.mirea.exercise23and24.ex1;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Riid {

    private List<String[]> rows;

    public Riid() {
        String fileName = "src/ru/mirea/Prakt2324/exercise1/movementList.csv";
        Path myPath = Paths.get(fileName);
        CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
        System.out.println("Общий список: ");
        try (Reader br = Files.newBufferedReader(myPath,  StandardCharsets.UTF_8);
             CSVReader reader = new CSVReaderBuilder(br).withCSVParser(parser).build())
        {
            rows = reader.readAll();
            for (String[] row : rows) {
                for (String e : row) {
                    System.out.format("%s ", e);
                }
                System.out.println();
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Полезная инфомация:");
        float rasx = 0;
        for(String r : getRow(7))
        {
            if(r != null) rasx += Float.parseFloat(r.replace(",", "."));
        }
        System.out.println("Сумма расходов: " + rasx + " руб.");
        float dox = 0;
        for(String r : getRow(6))
        {
            if(r != null) dox += Float.parseFloat(r.replace(",", "."));
        }
        System.out.println("Сумма доходов: " + dox + " руб.");
        System.out.println();
        System.out.println("Суммы расходов по организациям:");
        HashMap<String, Float> map = new HashMap<>();
        for (int i = 1; i < rows.size(); i++) {
            String[] row = rows.get(i);
            String key = row[5].split("    ")[1];
            Float ras = Float.parseFloat(row[7].replace(",", "."));
            if(map.containsKey(key)) {
                Float ds = map.get(key);
                ds += ras;
                map.put(key, ds);
            }
            else
                map.put(key, ras);
        }
        for(String pr : map.toString().replace("{", "").replace("}", "").replace("=", " ").split(", "))
        {
            System.out.println(pr + " руб.");
        }
    }

    public String[] getRow(int rw)
    {
        String[] RW = new String[rows.size()];
        for (int i = 1; i < rows.size(); i++) {
            String[] row = rows.get(i);
            RW[i-1] = row[rw];
        }
        return RW;
    }
}