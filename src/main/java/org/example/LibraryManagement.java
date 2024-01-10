package org.example;

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();

        // Додавання книг у бібліотеку
        library.addBook(new Book("Назва1", "Автор1", "ISBN111", 2000));
        library.addBook(new Book("Назва2", "Автор2", "ISBN222", 2010));

        // Показ усіх книг в бібліотеці
        System.out.println("Усі книгb в бібліотеці:");
        library.displayBooks();

        // Пошук книги за назвою
        String searchTitle = "Назва1";
        Book foundBook = library.findBookByTitle(searchTitle);
        if (foundBook != null) {
            System.out.println("Знайдено книгу за назвою '" + searchTitle + "': " + foundBook);
        } else {
            System.out.println("Книга за назвою '" + searchTitle + "' не знайдена.");
        }

        // Видалення книги за ISBN
        String isbnToDelete = "ISBN111";
        library.deleteBookByISBN(isbnToDelete);

        // Повторний показ усіх книг після видалення
        System.out.println("Усі книги в бібліотеці після видалення:");
        library.displayBooks();
    }
}
