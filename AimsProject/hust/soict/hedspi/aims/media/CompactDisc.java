//Dang Hong Minh - 20225740
package AimsProject.hust.soict.hedspi.aims.media;
import java.util.*;
public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();
    public CompactDisc(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}
    public CompactDisc(int id, String title, String category, float cost,
    String director, int length, String artist) {
        super(id, title, category, cost, director, length);
        this.artist = artist;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    //Add track to CD
    public void addTrack(Track track) {
        int indexTrack = tracks.indexOf(track);
        if (indexTrack == -1) {
            System.out.println("Track is already in the list");
            return;
        }
        tracks.add(track);
        System.out.println("Add track successfully");
    }
    //Remove track from CD
    public void removeTrack(Track track) {
        int indexTrack = tracks.indexOf(track);
        if (indexTrack == -1) {
            System.out.println("Track is NOT in the list");
            return;
        }
        tracks.remove(indexTrack);
        System.out.println("Remove track successfully");
    }
    @Override
    //Total length of CD (sum of all length of tracks in CD)
    public int getLength() {
        int length = 0;
        for (Track track : tracks) {
            length += track.getLength();
        }
        setLength(length);
        return length;
    }
    //Play CD and its tracks
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD artist: " + artist);
        System.out.println("CD length: " + this.getLength());
        for (Track track : tracks) {
            track.play();
        }
    }
    //Print details of CD
    public void print() {
        System.out.println(getId() + ". CD - " + getTitle() + " - " + getCategory() + " - "
        + getDirector() + " - " + artist + " - " + getLength() + ": " + getCost() + "$");
    }
}