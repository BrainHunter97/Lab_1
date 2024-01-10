package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
        System.setOut(new PrintStream(outputStreamCaptor));
        library.addBook(new Book("Назва1", "Автор1", "ISBN111", 2000));
        library.addBook(new Book("Назва2", "Автор2", "ISBN222", 2010));
    }


    @Test
    public void testFindBookByTitle() {
        Book foundBook = library.findBookByTitle("Назва1");
        assertNotNull(foundBook);
        assertEquals("Назва1", foundBook.getTitle());
    }

    @Test
    public void testFindBookByNonexistentTitle() {
        Book foundBook = library.findBookByTitle("НезнайомаНазва");
        assertNull(foundBook);
    }
}
