package ru.mirea.exercise27and28;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Disintegrator3000
{
    long start;
    int jdr = Runtime.getRuntime().availableProcessors(), jdr1 = 0;

    public Disintegrator3000() {
        String srcFolder = "images";
        String dstFolder = "dst";
        File srcDir = new File(srcFolder);
        System.out.println("Программа оптимизированна под многопоток!!!!1!");
        System.out.println("Число ядер в компьютере: " + jdr);
        start = System.currentTimeMillis();
        File[] files = srcDir.listFiles();
        try
        {
            if (!Files.exists(Paths.get(dstFolder)))
                Files.createDirectories(Paths.get(dstFolder));
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        assert files != null;
        List<File> it = Arrays.asList(files);
        int ud = (int) Math.ceil( ((double) it.size())/jdr);
        System.out.println("Число файлов в папке: " + it.size() + " Количество файлов на поток: " + ud);
        for(int i = 0, st = 0, ed = 0; i < jdr; i++){
            if(i+1==jdr)
                ed += it.size() - ed;
            else
                ed += ud;
            System.out.format("start: %d, end: %d\n", st, ed);
            new Thread(new Thred(it.subList(st, ed).iterator(),srcFolder,dstFolder, this)).start();
            if(i+1==jdr)
                st += it.size() - st;
            else
                st += ud;
            jdr1++;
        }
    }

    void stop()
    {
        if(jdr1 == 1)
            System.out.println("Duration: " + (System.currentTimeMillis() - start));
        jdr1--;
    }
}