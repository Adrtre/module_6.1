package com.kodilla.patterns.library;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTestSuite {

    @Test
    void testGetBooks() {
        // Given
        Library library = new Library("Public Library");
        library.loadData();

        // When
        Library shallowCopyLibrary = null;
        Library deepCopyLibrary = null;
        try {
            shallowCopyLibrary = library.clone();
            deepCopyLibrary = library.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Then
        List<Book> expectedBooks = new ArrayList<>(library.getBooks());
        List<Book> shallowCopyBooks = new ArrayList<>(shallowCopyLibrary.getBooks());
        List<Book> deepCopyBooks = new ArrayList<>(deepCopyLibrary.getBooks());

        assertEquals(expectedBooks.size(), shallowCopyBooks.size());
        assertEquals(expectedBooks.size(), deepCopyBooks.size());
        assertIterableEquals(expectedBooks, shallowCopyBooks);
        assertIterableEquals(expectedBooks, deepCopyBooks);
        assertNotSame(library, shallowCopyLibrary);
        assertNotSame(library, deepCopyLibrary);
        assertNotSame(shallowCopyLibrary, deepCopyLibrary);
    }
}

