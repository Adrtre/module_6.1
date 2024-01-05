package com.kodilla.exception.io;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class FileReaderTestSuite {


    @Test
    void testReadFile() {
        // given
        FileReader fileReader = new FileReader();

        // when & then
        assertThrows(FileReaderException.class, () -> fileReader.readFile());
    }
}
