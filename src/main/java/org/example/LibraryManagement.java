package org.example;

import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nОберіть опцію:");
            System.out.println("1. Додати книгу");
            System.out.println("2. Показати всі книги");
            System.out.println("3. Знайти книгу за назвою");
            System.out.println("4. Видалити книгу за ISBN");
            System.out.println("5. Вийти з програми");

            int option = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            switch (option) {
                case 1:
                    System.out.println("Введіть назву книги:");
                    String title = scanner.nextLine();
                    System.out.println("Введіть автора:");
                    String author = scanner.nextLine();
                    System.out.println("Введіть ISBN:");
                    String isbn = scanner.nextLine();
                    System.out.println("Введіть рік видання:");
                    int publicationYear = scanner.nextInt();
                    scanner.nextLine(); // очистка буфера
                    library.addBook(new Book(title, author, isbn, publicationYear));
                    break;
                case 2:
                    System.out.println("Усі книги в бібліотеці:");
                    library.displayBooks();
                    break;
                case 3:
                    System.out.println("Введіть назву книги для пошуку:");
                    String searchTitle = scanner.nextLine();
                    Book foundBook = library.findBookByTitle(searchTitle);
                    if (foundBook != null) {
                        System.out.println("Знайдено книгу за назвою '" + searchTitle + "': " + foundBook);
                    } else {
                        System.out.println("Книга за назвою '" + searchTitle + "' не знайдена.");
                    }
                    break;
                case 4:
                    System.out.println("Введіть ISBN книги для видалення:");
                    String isbnToDelete = scanner.nextLine();
                    library.deleteBookByISBN(isbnToDelete);
                    break;
                case 5:
                    System.out.println("Завершення роботи програми.");
                    scanner.close();
                    return; // Виход з методу main() та завершення роботи програми
                default:
                    System.out.println("Невідома опція. Будь ласка, оберіть іншу опцію.");
            }
        }
    }
}
