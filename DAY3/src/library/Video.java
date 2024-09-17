package library;

public class Video extends MediaItem{
 
	private String director;
	private String genre;
	private int yearReleased;
	
	
	public Video(int identityNum, String title, int noOfCopies, int runtime, String director, String genre,
			int yearReleased) {
		super(identityNum, title, noOfCopies, runtime);
		this.director = director;
		this.genre = genre;
		this.yearReleased = yearReleased;
	}
	
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYearReleased() {
		return yearReleased;
	}
	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}


	@Override
	public void print() {
		System.out.println("IN Video print");
		System.out.println("Video item details: " + this);
		
	}
	
	
	@Override
    public String toString() {
        return super.toString() + ", director='" + director + "', genre='" + genre + "', yearReleased=" + yearReleased;
    }
	
}
