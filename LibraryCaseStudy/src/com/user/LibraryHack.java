package com.user;

import java.util.Optional;
import java.util.Scanner;

public class LibraryHack {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LibraryService libraryService = new LibraryService("Just Reading Library", "Gurgaon");

		System.out.println("Welcome to Library......!!!\n");

		System.out.println("Enter user type (admin/customer): \n");
		String userType = scanner.nextLine().toLowerCase();

		if (userType.equals("admin")) {
			while (true) {

				System.out.println("\nAdmin Options: ");
				System.out.println("1. View all books");
				System.out.println("2. Add new book");
				System.out.println("3. Delete book");
				System.out.println("4. Get the costly book based on publisher");
				System.out.println("5. Exit");
				int choice = scanner.nextInt();
				scanner.nextLine();

				switch (choice) {
				case 1:
					System.out.println("Books in library:");
					libraryService.getBooks();
					break;
				case 2:
					System.out.println("Enter book details (ISBN, Author, Publisher, Price): ");
					int no = scanner.nextInt();
					scanner.nextLine();
					String author = scanner.nextLine();
					String publisher = scanner.nextLine();
					float price = scanner.nextFloat();
					libraryService.addBook(new Book(no, author, publisher, price));
					break;
				case 3:
					System.out.println("Enter book ISBN to delete: ");
					int no1 = scanner.nextInt();
					libraryService.removeBook(no1);
					break;
				case 4:
					System.out.println("Enter publisher to find the costly book: ");
					String st = scanner.nextLine();
					Optional<Book> maxPriceBook = libraryService.findMaxPrice(st);
					maxPriceBook.ifPresentOrElse(book -> System.out.println(book.toString()),
							() -> System.out.println("No books found for the publisher."));
					break;
				case 5:
					System.out.println("Exiting admin.");
					return;

				}
			}
		} else if (userType.equals("customer")) {
			while (true) {
				System.out.println("\nCustomer Options:");
				System.out.println("1. View all books");
				System.out.println("2. Get the costly book based on publisher");
				System.out.println("3. Exit");
				int choice = scanner.nextInt();
				scanner.nextLine();

				switch (choice) {
				case 1:
					System.out.println("Books in library:");
					libraryService.getBooks();
					break;
				case 2:
					System.out.println("Enter publisher to find the costly book: ");
					String str = scanner.nextLine();
					Optional<Book> maxPriceBook = libraryService.findMaxPrice(str);
					maxPriceBook.ifPresentOrElse(book -> System.out.println(book.toString()),
							() -> System.out.println("No books found for the publisher."));
					
					break;
				case 3:
					System.out.println("Exiting customer.");
					return;

				}
			}
		} else {
			System.out.println("Invalid user type.");
		}
		scanner.close();
	}
}