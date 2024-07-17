package com.example.library;

import java.util.Scanner;

public class LibraryMenu {
    private static Library library = new Library();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Library Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Find Book by Title");
            System.out.println("4. Find Book by Author");
            System.out.println("5. List All Books");
            System.out.println("6. List Available Books");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String ISBN = scanner.nextLine();
                    System.out.print("Enter genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter publication year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter department: ");
                    String department = scanner.nextLine();
                    System.out.print("Is available (true/false): ");
                    boolean isAvailable = scanner.nextBoolean();
                    library.addBook(new Book(title, author, ISBN, genre, year, department, isAvailable));
                    break;
                case 2:
                    System.out.print("Enter ISBN: ");
                    String isbnToRemove = scanner.nextLine();
                    library.removeBook(isbnToRemove);
                    break;
                case 3:
                    System.out.print("Enter title: ");
                    String titleToFind = scanner.nextLine();
                    System.out.println("Books found: " + library.findBookByTitle(titleToFind));
                    break;
                case 4:
                    System.out.print("Enter author: ");
                    String authorToFind = scanner.nextLine();
                    System.out.println("Books found: " + library.findBookByAuthor(authorToFind));
                    break;
                case 5:
                    System.out.println("All books: " + library.listAllBooks());
                    break;
                case 6:
                    System.out.println("Available books: " + library.listAvailableBooks());
                    break;
                case 7:
                    return;
            }
        }
    }
}
