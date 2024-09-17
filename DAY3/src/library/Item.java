package library;

abstract class Item {

	private int identityNum;
	private String title;
	private int noOfCopies;
	
	public Item(int identityNum, String title, int noOfCopies) {
		super();
		this.identityNum = identityNum;
		this.title = title;
		this.noOfCopies = noOfCopies;
	}

	public int getIdentityNum() {
		return identityNum;
	}


	public void setIdentityNum(int identityNum) {
		this.identityNum = identityNum;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getNoOfCopies() {
		return noOfCopies;
	}


	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	
	public void checkIn() {
		noOfCopies++;
	}
	public boolean checkOut() {
		if(noOfCopies > 0) {
			noOfCopies--;
			return true;
		}
		return false;
	}
	
	public abstract void print();
	
	public void addItem(int count) {
		this.noOfCopies += count;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//	
//	}


	@Override
	public String toString() {
		return "Item [identityNum=" + identityNum + ", title=" + title + ", noOfCopies=" + noOfCopies + "]";
	}
	
}
