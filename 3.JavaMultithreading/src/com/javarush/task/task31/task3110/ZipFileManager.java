package com.javarush.task.task31.task3110;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileManager {
    private final Path zipFile;

    public ZipFileManager(Path zipFile) {
        this.zipFile = zipFile;
    }


    public void createZip(Path source) throws Exception {

        // Проверяем, существует ли директория, где будет создаваться архив
        // При необходимости создаем ее
        Path zipDirectory = zipFile.getParent();
        if (Files.notExists(zipDirectory))
            Files.createDirectories(zipDirectory);

        try (ZipOutputStream out = new ZipOutputStream(Files.newOutputStream(zipFile))) {
            ZipEntry zipEntry = new ZipEntry(source.getFileName().toString());
            out.putNextEntry(zipEntry);

//        try(InputStream in = new FileInputStream(String.valueOf(source))){
            try (InputStream in = Files.newInputStream(source)) {
//            in.transferTo(out);
                byte[] buffer = new byte[8 * 1024];
                int lengths;
                while ((lengths = in.read(buffer)) > 0) {
                    out.write(buffer, 0, lengths);
                }
            }
            out.closeEntry();
        }

    }


}