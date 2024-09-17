package library;

public class JournalPaper extends WrittenItem {

	private int yearofpublished;

	public JournalPaper(int identityNum, String title, int noOfCopies, String authorName, int authorAge,
			int yearofpublished) {
		super(identityNum, title, noOfCopies, authorName, authorAge);
		this.yearofpublished = yearofpublished;
	}

	public int getYearofpublished() {
		return yearofpublished;
	}

	public void setYearofpublished(int yearofpublished) {
		this.yearofpublished = yearofpublished;
	}
	

	@Override
	public void print() {
		// TODO Auto-generated method stub
        System.out.println("Journal Paper Details: " + this);
	}
	
	
	@Override
    public String toString() {
        return super.toString() + ", yearPublished=" + yearofpublished;
    }
	
}
