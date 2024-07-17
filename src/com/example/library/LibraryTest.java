package com.example.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @BeforeEach
    public void setUp() {
        library = new Library();
        book1 = new Book("Title1", "Author1", "123456", "Genre1", 2020, "Science", true);
        book2 = new Book("Title2", "Author2", "234567", "Genre2", 2021, "Arts", false);
        book3 = new Book("Title1", "Author3", "345678", "Genre3", 2022, "Science", true);
    }

    @Test
    public void testAddBook() {
        library.addBook(book1);
        assertEquals(1, library.listAllBooks().size());
        library.addBook(book1);  // Duplicate ISBN
        assertEquals(1, library.listAllBooks().size());
    }

    @Test
    public void testRemoveBook() {
        library.addBook(book1);
        library.addBook(book2);
        library.removeBook("123456");
        assertEquals(1, library.listAllBooks().size());
        assertEquals("234567", library.listAllBooks().get(0).getISBN());
    }

    @Test
    public void testFindBookByTitle() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        List<Book> foundBooks = library.findBookByTitle("Title1");
        assertEquals(2, foundBooks.size());
    }

    @Test
    public void testFindBookByAuthor() {
        library.addBook(book1);
        library.addBook(book2);
        List<Book> foundBooks = library.findBookByAuthor("Author1");
        assertEquals(1, foundBooks.size());
    }

    @Test
    public void testListAllBooks() {
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.listAllBooks().size());
    }

    @Test
    public void testListAvailableBooks() {
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(1, library.listAvailableBooks().size());
    }
}
