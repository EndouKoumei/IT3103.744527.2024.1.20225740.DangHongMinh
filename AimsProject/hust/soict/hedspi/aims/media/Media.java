//Dang Hong Minh - 20225740
package AimsProject.hust.soict.hedspi.aims.media;
import java.util.*;
public abstract class Media {
	private int id;
	private String title;
	private String category;
	private float cost;
	public static final Comparator<Media> COMPARE_BY_TITLE_COST	= new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE	= new MediaComparatorByCostTitle();
	public Media(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
    public Media(int id, String title, float cost) {
		super();
		this.id = id;
		this.title = title;
        this.cost = cost;
	}
    public Media(int id, String title, String category, float cost) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	//Print a media
    public void print() {

    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	//Find out if the disk is a match given the title.
	public boolean isMatch(String title) {
		return title.equals(this.title);
	}
	//Find out if the disk is a match given the ID.
	public boolean isMatch(int id) {
		return id == this.id;
	}	
@Override
    public boolean equals(Object o) {
        if (o instanceof Media media) {
            return title.equals(media.getTitle());
        }
        return false;
    }
	public String toString () {
        return "Media {ID = " + id
        + ", Title = " + title
        + ", Category = " + category
        + ", Cost = " + cost + "}";
    }
	public static void main(String[] args) {
	    List<Media> mediae = new ArrayList<>();
	    CompactDisc cd = new CompactDisc(1,"Soledad", "Ballad", 12.5f, "Alice", 123, "Bob");
	    DigitalVideoDisc dvd = new DigitalVideoDisc(3,"Final Fantasy X", "Fantasy", 222.22f );
	    Book book = new Book(2,"Operating System Concepts", "ICT", 30f);
	    //Add objects to list
	    mediae.add(cd);
	    mediae.add(dvd);
	    mediae.add(book);
		Collections.sort(mediae, Media.COMPARE_BY_TITLE_COST);
	    for (Media media : mediae) {
	        System.out.println(media.toString());
	    }
	}
}