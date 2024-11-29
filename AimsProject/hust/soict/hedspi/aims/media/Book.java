//Dang Hong Minh - 20225740
package AimsProject.hust.soict.hedspi.aims.media;
import java.util.*;
public class Book extends Media {
    private List<String> authors = new ArrayList<String>(); //Attribute
    //Constructor
    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }
    public Book(int id, String title, String category, float cost, List<String> authors) {
		super(id, title, category, cost);
		this.authors = authors;
	}
    //Add author
    public void addAuthor(String AuthorName) {
        if (authors.contains(AuthorName)) {
            System.out.println("Author already in the list");
            return;
        }
        authors.add(AuthorName);
        System.out.println("Add author successfully");
    }
    //Remove author
    public void removeAuthor(String AuthorName) {
        if (!authors.contains(AuthorName)) {
            System.out.println("Author not in the list");
            return;
        }
        authors.remove(AuthorName);
        System.out.println("Remove author successfully");
    }
    public List<String> getAuthor() {
        return authors;
    }
    public void setAuthor(List<String> authors) {
        this.authors = authors;
    }
    //Print details of book
    @Override
    public void print() {
        System.out.print(getId() + ". Book: "
        + getTitle() + " - "
        + getCategory() + " - ");
        for (String author : authors) {
            System.out.print(author + " - ");
        }
        System.out.println(getCost() + "$");
    }
}