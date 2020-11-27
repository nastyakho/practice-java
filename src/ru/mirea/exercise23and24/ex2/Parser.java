package ru.mirea.exercise23and24.ex2;

import java.io.*;
import java.net.URL;
import java.util.HashSet;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Parser {

    HashSet<String> names = new HashSet();

    public Parser() {
        Document document = null;
        try {
            document = Jsoup.connect("https://www.mirea.ru/")
                    .userAgent("Chrome/4.0.249.0 Safari/532.5")
                    .referrer("http://www.google.com")
                    .get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("HTML-код страницы получен");
        Elements imageElements = document.select("img");
        System.out.println("Абсолютные ссылки на изображения:");
        for(Element imageElement : imageElements){
            String strImageURL = imageElement.attr("abs:src");
            if(!strImageURL.isEmpty()) {
                System.out.println(strImageURL);
                downloadImage(strImageURL);
            }
        }
        System.out.println("Изображения загружены в папку images");
        System.out.println("Список скачанных файлов:");
        for(String name : names)
            System.out.println(name);
    }

    private void downloadImage(String strImageURL){
        String strImageName =
                strImageURL.substring( strImageURL.lastIndexOf("/") + 1 );
        try {
            URL urlImage = new URL(strImageURL);
            InputStream in = urlImage.openStream();
            byte[] buffer = new byte[4096];
            int n = -1;
            OutputStream os = new FileOutputStream( "F:/Rep/Prakt/images/" + strImageName);
            while ( (n = in.read(buffer)) != -1 ){
                os.write(buffer, 0, n);
            }
            os.close();
            names.add(strImageName);
        } catch (FileNotFoundException e1){}
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}