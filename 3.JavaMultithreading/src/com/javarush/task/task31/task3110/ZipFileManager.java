package com.javarush.task.task31.task3110;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
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

        ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(zipFile));
        ZipEntry zipEntry = new ZipEntry(source.getFileName().toString());
        zipOutputStream.putNextEntry(zipEntry);

        InputStream inputStream = new ZipInputStream(Files.newInputStream(source));

        copyData(inputStream, zipOutputStream);
        zipOutputStream.closeEntry();
        inputStream.close();
        zipOutputStream.close();
    }

    private void copyData(InputStream in, OutputStream out) throws Exception {
      byte[] buf = new byte[8192];
    int length;
    while ((length = in.read(buf)) != -1) {
        out.write(buf, 0, length);
    }
    }


}