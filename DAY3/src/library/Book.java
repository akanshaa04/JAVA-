package library;

public class Book extends WrittenItem {

	public Book(int identityNum, String title, int noOfCopies, String authorName, int authorAge) {
		super(identityNum, title, noOfCopies, authorName, authorAge);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Book Details: "+ this);
		
	}


	
	
	
}
