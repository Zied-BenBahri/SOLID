package com.directi.training.dip.exercise;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class NetworkDataReader implements IDataReader {
    private final URL url;

    public NetworkDataReader(String urlString) {
        try {
            this.url = new URL(urlString);
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid URL: " + urlString, e);
        }
    }

    @Override
    public String read() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), StandardCharsets.UTF_8))) {
            return br.lines().collect(Collectors.joining("\n"));
        } catch (Exception e) {
            throw new RuntimeException("Failed to read from URL: " + url, e);
        }
    }
}