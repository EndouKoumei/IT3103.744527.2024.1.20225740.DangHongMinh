//Dang Hong Minh - 20225740
package lab2;
public class DigitalVideoDisc {
    private String title;
    private String category;
    private float cost;
    private String director;
    private int length;

    public DigitalVideoDisc(String title, String category, float cost, String director, int length) {
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

    @Override
    public String toString() {
        return "DVD Title: " + title + ", Category: " + category + ", Cost: $" + cost +
               ", Director: " + director + ", Length: " + length + " mins";
    }
}