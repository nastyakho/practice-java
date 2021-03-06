package ru.mirea.exercise27and28;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class Thred implements Runnable {

    private final Iterator<File> res;
    String srcFolder;
    String dstFolder;
    Disintegrator3000 func;

    public Thred(Iterator<File> res, String srcFolder, String dstFolder, Disintegrator3000 func) {
        this.res = res;
        this.srcFolder = srcFolder;
        this.dstFolder = dstFolder;
        this.func = func;
    }

    @Override
    public void run() {
        while(res.hasNext()){
            try {
                File file = res.next();
                System.out.println(file.getAbsolutePath());
                BufferedImage image = ImageIO.read(file);
                if(image == null)
                    continue;
                int newWidth = image.getWidth() / 2;
                int newHeight = (int) Math.round(image.getHeight() / (image.getWidth() / (double) newWidth));
                BufferedImage newImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
                int widthStep = image.getWidth() / newWidth;
                int heightStep = image.getHeight() / newHeight;
                for (int x = 0; x < newWidth; x++)
                {
                    for (int y = 0; y < newHeight; y++) {
                        int rgb = image.getRGB(x * widthStep, y * heightStep);
                        newImage.setRGB(x, y, rgb);
                    }
                }
                File newFile = new File(dstFolder + "/" + file.getName());
                ImageIO.write(newImage, "jpg", newFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        func.stop();
    }
}