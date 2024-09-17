package library;

public abstract class MediaItem extends Item {

	private int runtime;

	public MediaItem(int identityNum, String title, int noOfCopies, int runtime) {
		super(identityNum, title, noOfCopies);
		this.runtime = runtime;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
	
	@Override
    public String toString() {
        return super.toString() + ", runtime=" + runtime + " minutes";
    }
}
