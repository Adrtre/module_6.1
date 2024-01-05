package com.kodilla.exception.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class FileReader {

    public String readFile() throws FileReaderException {

        ClassLoader classLoader = getClass().getClassLoader();

        try (InputStream inputStream = classLoader.getResourceAsStream("names.txt");
             InputStreamReader streamReader = new InputStreamReader(inputStream);
             BufferedReader reader = new BufferedReader(streamReader)) {

            return reader.lines().collect(Collectors.joining("\n"));

         } catch (IOException e) {
        throw new FileReaderException("Problem while reading a file!", e);

    } finally {
            System.out.println("I am gonna be here... always!");
        }

}}
