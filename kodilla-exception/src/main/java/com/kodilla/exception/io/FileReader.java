package com.kodilla.exception.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

public class FileReader {

    public void readFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("names.txt").getFile());

        try (Stream<String> fileLines = new BufferedReader(new InputStreamReader(classLoader.getResourceAsStream("names.txt"), StandardCharsets.UTF_8)).lines()) {
            fileLines.forEach(System.out::println);
        } finally {
            System.out.println("I am gonna be here... always!");
        }
    }
}