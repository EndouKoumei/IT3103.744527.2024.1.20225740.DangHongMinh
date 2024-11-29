//Dang Hong Minh - 20225740
package AimsProject.hust.soict.hedspi.aims.media;
public class DigitalVideoDisc extends Disc implements Playable {
    //Attribute
    //Construct by id, title
	public DigitalVideoDisc(int id, String title) {
		super(id, title);
	}
	//Construct by id, title, cost
	public DigitalVideoDisc(int id, String title, float cost) {
		this(id, title);
		this.setCost(cost);
	}
	//Construct by id, title, category, cost 
	public DigitalVideoDisc(int id, String title, String category, float cost) {
		this(id, title, cost);
		this.setCategory(category);
	}
    //Construct by id, title, category, director, cost 
    public DigitalVideoDisc(int id, String title, String category, String director, float cost) {
		this(id, title, category, cost);
		this.setDirector(director);
	}
	//Construct by id, title, category, director, length, cost
    public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
		this(id, title, category, director, cost);
		this.setLength(length);
    }
	//Print DVD
	@Override
	public void print() {
		System.out.println(getId() + ". DVD: " + getTitle() + " - " + getDirector()
		+ " - " + getCategory() + " - " + getLength() + ": " + getCost() + "$");
	}
	//Play DVD
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
    }
}