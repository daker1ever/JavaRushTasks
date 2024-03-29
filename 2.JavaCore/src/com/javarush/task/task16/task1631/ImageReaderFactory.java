package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageType) {
        try {
            switch (imageType) {
                case BMP:
                    return new BmpReader();
                case JPG:
                    return new JpgReader();
                case PNG:
                    return new PngReader();
                default:
                    throw new IllegalArgumentException("Неизвестный тип картинки");
            }
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
    }
}
