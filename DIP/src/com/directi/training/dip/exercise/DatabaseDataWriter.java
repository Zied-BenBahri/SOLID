package com.directi.training.dip.exercise;

public class DatabaseDataWriter implements IDataWriter {
    private final MyDatabase database;

    public DatabaseDataWriter(MyDatabase database) {
        this.database = database;
    }

    @Override
    public void write(String data) {
        database.write(data);
    }
}