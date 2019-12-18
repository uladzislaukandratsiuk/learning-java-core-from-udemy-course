package com.exmple.nio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {

    private static final String FILE_PATH = "Input & Output NIO/data.txt";

    public static void main(String[] args) {

        try {
            Path dataPath = FileSystems.getDefault().getPath(FILE_PATH);
            Files.writeString(dataPath, "\nline 4", StandardOpenOption.APPEND);
            List<String> lines = Files.readAllLines(dataPath);
            for(String line : lines) {
                System.out.println(line);
            }

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
