package com.tts;

import java.util.ArrayList;

public class Library {

    private String address;
    ArrayList<Book> bookType;

    public Library(String address) {
        this.address = address;
        this.bookType = new ArrayList<Book>();
    }
    public void addBook(Book book){
        this.bookType.add(book);
    }
    public static void printOpeningHours(){
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }
    public void printAddress(){
        System.out.println(this.address);
    }
    public void borrowBook( String bookTitle) {
        for (int i = 0; i <= bookType.size() - 1; i++) {
            if (bookType.get(i).getTitle().equals(bookTitle)) {
                bookType.get(i).rented();
            }


        }
    }
    public void printAvailableBooks() {
        boolean libraryIsEmpty = true;

        for(int i = 0; i < this.bookType.size(); ++i) {
            Book libraryBook = this.bookType.get(i);
            if (!libraryBook.isBorrowed()) {
                System.out.println(libraryBook.getTitle());
                libraryIsEmpty = false;
            }
        }

        if (libraryIsEmpty) {
            System.out.println("Sorry, our catalog is empty");
        }

    }
    public String returnBook(String bookTitle) {
        boolean found = false;

        for(int i = 0; i < this.bookType.size(); ++i) {
            Book libraryBook = (Book)this.bookType.get(i);
            String libraryBookTitle = libraryBook.getTitle();
            if (libraryBookTitle.equals(bookTitle)) {
                if (libraryBook.isBorrowed()) {
                    libraryBook.returned();
                    System.out.println("You successfully returned " + libraryBookTitle + "!");
                    found = true;
                    break;
                }

                if (!found) {
                    System.out.println("Are you sure you got the book from here? It isn't in our system.");
                }
            }
        }
        System.out.println();
        return null;
    }
            public static void main (String[]args){
                // Create two libraries
                Library firstLibrary = new Library("10 Main St.");
                Library secondLibrary = new Library("228 Liberty St.");

                // Add four books to the first library
                firstLibrary.addBook(new Book("The Da Vinci Code"));
                firstLibrary.addBook(new Book("Le Petit Prince"));
                firstLibrary.addBook(new Book("A Tale of Two Cities"));
                firstLibrary.addBook(new Book("The Lord of the Rings"));

                // Print opening hours and the addresses
                System.out.println("Library hours:");
                printOpeningHours();
                System.out.println();

                System.out.println("Library addresses:");
                firstLibrary.printAddress();
                secondLibrary.printAddress();
                System.out.println();

                // Try to borrow The Lords of the Rings from both libraries
                System.out.println("Borrowing The Lord of the Rings:");
                firstLibrary.borrowBook("The Lord of the Rings");
                firstLibrary.borrowBook("The Lord of the Rings");
                secondLibrary.borrowBook("The Lord of the Rings");
                System.out.println();

                // Print the titles of all available books from both libraries
                System.out.println("Books available in the first library:");
                firstLibrary.printAvailableBooks();
                System.out.println();
                System.out.println("Books available in the second library:");
                secondLibrary.printAvailableBooks();
                System.out.println();

                // Return The Lords of the Rings to the first library
                System.out.println("Returning The Lord of the Rings:");
                firstLibrary.returnBook("The Lord of the Rings");
                System.out.println();

                // Print the titles of available from the first library
                System.out.println("Books available in the first library:");
                firstLibrary.printAvailableBooks();
            }


        }

