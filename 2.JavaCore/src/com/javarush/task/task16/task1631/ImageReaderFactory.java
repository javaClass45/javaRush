package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;


public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes imgTp) throws IllegalArgumentException {

        if (imgTp == ImageTypes.JPG) return new JpgReader();
        if (imgTp == ImageTypes.BMP)return new BmpReader();
        if (imgTp == ImageTypes.PNG)return new PngReader();
        throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}

