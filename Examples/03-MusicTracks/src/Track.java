public class Track { 
	String title;
	Band band; 
	String album; 
	int year; 
	double length;
	
	public Track(String t, Band b, String a, int y, double l) {
		this.title = t; 
		this.band= b; 
		this.album=a; 
		this.year=y; 
		this.length=l;
	}
	public Track() { 
		this.title = null;
		this.band= null;
		this.album=null; 
		this.year=0; 
		this.length=0.0;
	}
	
	@Override
	public String toString() {
		return "Title: "+title+"\nAlbum: "+album+"\nLength:"+
	           length+"\nReleased in: "+year+"\nBand name: "
				+band.nameb+"\nBand members:\n"+band;
	} 
	
}