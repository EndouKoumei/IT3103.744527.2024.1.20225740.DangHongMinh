//Dang Hong Minh - 20225740
package AimsProject.hust.soict.hedspi.aims.media;
public class Disc extends Media {
	private int length;
	private String director;
    public Disc(int id, String title) {
        super(id, title);
    } 
	public Disc(int id, String title, String category, float cost) {
		super(id,title, category, cost);
	}
	public Disc(int id, String title, String category, float cost, String director, int length) {
		super(id, title, category, cost);
		this.length = length;
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void play() {
	}
}