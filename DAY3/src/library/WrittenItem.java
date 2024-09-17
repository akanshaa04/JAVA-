package library;

public abstract class WrittenItem extends Item{
	
	private String AuthorName;
	private int AuthorAge;
	
	public WrittenItem(int identityNum, String title, int noOfCopies, String authorName, int authorAge) {
		super(identityNum, title, noOfCopies);
		AuthorName = authorName;
		AuthorAge = authorAge;
	}

	public abstract void print();
	
	public String getAuthorName() {
		return AuthorName;
	}

	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}

	public int getAuthorAge() {
		return AuthorAge;
	}

	public void setAuthorAge(int authorAge) {
		AuthorAge = authorAge;
	}

	@Override
	public String toString() {
		return super.toString() + ", Author Name='" + AuthorName + "'";	
	
	}
	
	
	
}
