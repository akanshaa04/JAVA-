package library;

public class CD extends MediaItem {


	private String artist;
	private String genre;

	public CD(int identityNum, String title, int noOfCopies, int runtime, String artist, String genre) {
		super(identityNum, title, noOfCopies, runtime);
		this.artist = artist;
		this.genre = genre;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public void print() {
		System.out.println("CD Details: "+ this);
	}
	
	@Override
	public String toString() {
		return super.toString() + "Artist " + artist + "genre: "+ genre; 
		
	}
	
	
}
