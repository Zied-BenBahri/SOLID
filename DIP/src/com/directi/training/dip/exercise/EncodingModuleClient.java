package com.directi.training.dip.exercise;

public class EncodingModuleClient {
    public static void main(String[] args) {
        // File -> File
        EncodingModule fileToFile = new EncodingModule(
                new FileDataReader("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt"),
                new FileDataWriter("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt"));
        fileToFile.encode();

        // Network -> Database
        EncodingModule netToDb = new EncodingModule(
                new NetworkDataReader("http://myfirstappwith.appspot.com/index.html"),
                new DatabaseDataWriter(new MyDatabase()));
        netToDb.encode();
    }
}