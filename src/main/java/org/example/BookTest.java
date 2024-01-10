package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
    @Test
    public void testGetTitle() {
        Book book = new Book("Назва1", "Автор1", "ISBN111", 2000);
        assertEquals("Назва1", book.getTitle());
    }

    @Test
    public void testGetIsbn() {
        Book book = new Book("Назва1", "Автор1", "ISBN111", 2000);
        assertEquals("ISBN111", book.getIsbn());
    }

    @Test
    public void testToString() {
        Book book = new Book("Назва1", "Автор1", "ISBN111", 2000);
        String expectedString = "Book{title='Назва1', author='Автор1', isbn='ISBN111', publicationYear=2000}";
        assertEquals(expectedString, book.toString());
    }
}
