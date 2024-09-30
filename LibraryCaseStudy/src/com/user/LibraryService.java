package com.user;

import java.util.ArrayList;
import java.util.Optional;
import java.util.List;

class LibraryService {
    private String libraryName;
    private String address;
    private List<Book> books;

    public LibraryService(String libraryName, String address) {
        this.libraryName = libraryName;
        this.address = address;
        this.books = new ArrayList<>();
        initializeBooks(); 
    }

    private void initializeBooks() {
        books.add(new Book(101, "Author A", "Publisher A", 800));
        books.add(new Book(102, "Author B", "Publisher B", 400));
        books.add(new Book(103, "Author C", "Publisher A", 950));
        books.add(new Book(104, "Author D", "Publisher C", 600));
        books.add(new Book(105, "Author E", "Publisher B", 500));
    }

    public void getBooks() {
    	
    	for (Book book : books) {
			System.out.println(book.getBookIsbnNo() + " , " + 
    	book.getAuthor() + " , " + book.getPublisher() + " , " +
					book.getPrice());
		}
//        return books;
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void removeBook(int bookIsbnNo) {
        books.removeIf(book -> book.getBookIsbnNo() == bookIsbnNo);
    }

    public Optional<Book> findMaxPrice(String publisher) {
        return books.stream()
                .filter(book -> book.getPublisher().equalsIgnoreCase(publisher))
                .max((b1, b2) -> Float.compare(b1.getPrice(), b2.getPrice()));
    }

    @Override
    public String toString() {
        return "LibraryService{" +
                "libraryName='" + libraryName + '\'' +
                ", address='" + address + '\'' +
                ", books=" + books +
                '}';
    }
}