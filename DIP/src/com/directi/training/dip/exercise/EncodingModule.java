package com.directi.training.dip.exercise;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncodingModule {
    private final IDataReader reader;
    private final IDataWriter writer;

    public EncodingModule(IDataReader reader, IDataWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void encode() {
        String input = reader.read();
        String encoded = Base64.getEncoder().encodeToString(input.getBytes(StandardCharsets.UTF_8));
        writer.write(encoded);
    }
}