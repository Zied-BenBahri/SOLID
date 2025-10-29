package com.directi.training.dip.exercise;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDataReader implements IDataReader {
    private final Path path;

    public FileDataReader(String filePath) {
        this.path = Path.of(filePath);
    }

    @Override
    public String read() {
        try {
            return Files.readString(path, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException("Failed to read file: " + path, e);
        }
    }
}