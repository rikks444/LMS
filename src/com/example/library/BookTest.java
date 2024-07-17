package com.example.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
    @Test
    public void testBookCreation() {
        Book book = new Book("Title", "Author", "123456", "Genre", 2020, "Science", true);
        assertEquals("Title", book.getTitle());
        assertEquals("Author", book.getAuthor());
        assertEquals("123456", book.getISBN());
        assertEquals("Genre", book.getGenre());
        assertEquals(2020, book.getPublicationYear());
        assertEquals("Science", book.getDepartment());
        assertTrue(book.isAvailable());
    }
}
