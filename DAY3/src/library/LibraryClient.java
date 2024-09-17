package library;

public class LibraryClient {

	public static void main(String[] args) {
		Book book = new Book(2314, "Java Programming", 5, "John Doe",41);
		JournalPaper journal = new JournalPaper(001, "AI Research", 3, "Jane Smith",35,2022);
		Video video = new Video(0023, "The Matrix", 2, 136, "Wachowski Brothers", "Sci-Fi", 1999);
		CD cd = new CD(6721, "Greatest Hits", 4, 60, "The Beatles", "Rock");
		
		// Print details of each item
        book.print();
        System.out.println("----------------------");
        journal.print();
        System.out.println("----------------------");
        video.print();
        System.out.println("----------------------");
        cd.print();

        System.out.println("Booking Checking Out----");
        if (book.checkOut()) {
            System.out.println("Checked out successfully.");
        } else {
            System.out.println("No copies available.");
        }
        book.print();
        System.out.println("Book Checking In----");
        book.checkIn();
        book.print();
	}

}
