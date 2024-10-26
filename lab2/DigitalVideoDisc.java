//Dang Hong Minh - 20225740
package lab2;
public class DigitalVideoDisc {
    //Attribute
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    	//Construct by title
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
    	//Construct by title, cost
	public DigitalVideoDisc(String title, float cost) {
        	super();
		this.title = title;
        	this.cost = cost;
	}
	//Construct by title, category, cost 
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
        	this.title = title;
		this.category = category;
		this.cost = cost;
	}
    	//Construct by title, category, director, cost 
    	public DigitalVideoDisc(String title, String category, String director, float cost){
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	//Construct by title, category, director, length, cost
    	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        	super();
        	this.title = title;
        	this.category = category;
        	this.cost = cost;
        	this.director = director;
        	this.length = length;
    	}
    	public String getTitle() {
        	return title;
    	}
    	public String getCategory() {
        	return category;
    	}
    	public float getCost() {
        	return cost;
    	}
    	public String getDirector() {
        	return director;
    	}
    	public int getLength() {
        	return length;
    	}
}
