package com.directi.training.dip.exercise;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDataWriter implements IDataWriter {
    private final Path path;

    public FileDataWriter(String filePath) {
        this.path = Path.of(filePath);
    }

    @Override
    public void write(String data) {
        try {
            Files.writeString(path, data, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException("Failed to write file: " + path, e);
        }
    }
}