//Dang Hong Minh - 20225740
package AimsProject.hust.soict.hedspi.aims.media;
import AimsProject.hust.soict.hedspi.aims.exception.*;
import java.util.*;
import java.util.List;
import java.awt.*;
import javax.swing.*;
public class CompactDisc extends Disc {
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	public void addTrack(Track track) throws DupplicatedItemException {
		if (this.tracks.contains(track)) {
			throw new DupplicatedItemException("The track " + track.getTitle() + " is already in tracklist of " + this.getTitle());
		} else {
			this.tracks.add(track);
			System.out.println("The track " + track.getTitle() + " has been added to tracklist of " + this.getTitle());
		}
	}
	public void removeTrack(Track track) throws NonExistingItemException {
		if (this.tracks.remove(track)) {
			System.out.println("The track " + track.getTitle() + " has been removed from tracklist of " + this.getTitle());
		} else {
			throw new NonExistingItemException("The track " + track.getTitle() + " is not in tracklist of " + this.getTitle());
		}
	}
	public int getLength() {
		int totalLength = 0;
		for (Track track: this.tracks) {
			totalLength += track.getLength();
		}
		return totalLength;
	}
	public void play() throws PlayerException {
		if (this.getLength() <= 0) {
			throw new PlayerException("ERROR: CD length is non-positive!");
		} else {
			System.out.println("Playing CD: " + this.getTitle());
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			JPanel p = new JPanel();
			JDialog d = new JDialog();
			JLabel l1 = new JLabel("Now playing: " + this.getTitle());
			p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
			l1.setAlignmentX(Component.CENTER_ALIGNMENT);
			d.setTitle("Media Player");
			p.add(Box.createVerticalGlue());
			p.add(l1);
			p.add(Box.createVerticalGlue());
			d.add(p);
			d.setSize(250,100);
			int w = d.getSize().width;
	        int h = d.getSize().height;
	        int x = (dim.width - w) / 2;
	        int y = (dim.height - h) / 2;
			d.setLocation(x, y);
			d.setVisible(true);
			for (Track track: this.tracks) {
				try {
					track.play();
				} catch (PlayerException e) {
					throw e;
				}
			}
		}
	}
	public String getType() {
		return "CD";
	}
	public String getDetails() {
		StringBuffer tracklist = new StringBuffer();
		if (this.tracks.size() >= 1) {
			tracklist.append(this.tracks.get(0).getTitle());
			for (int i = 1; i < this.tracks.size(); i++) {
				tracklist.append(", " + this.tracks.get(i).getTitle());
			}
		}
		return ("Product ID: " + String.valueOf(this.getId())
		+ "\n" + "\t" + "Title: " + this.getTitle()
		+ "\n" + "\t" + "Category: " + this.getCategory()
		+ "\n" + "\t" + "Artist: " + this.getArtist()
		+ "\n" + "\t" + "Director: " + this.getDirector()
		+ "\n" + "\t" + "Tracklist: " + tracklist
		+ "\n" + "\t" + "Length: " + String.valueOf(this.getLength()) + " minutes"
		+ "\n" + "\t" + "Price: $" + String.valueOf(this.getCost()));
	}
	public CompactDisc(String title, String category, String artist, String director, float cost) {
		super(title, category, director, cost);
		this.artist = artist;
	}
	public CompactDisc(String title, String category, String artist, float cost) {
		super(title, category, cost);
		this.artist = artist;
	}
	public CompactDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	public CompactDisc(String title, String category) {
		super(title, category);
	}
	public CompactDisc(String title) {
		super(title);
	}
	public String getArtist() {
		return artist;
	}
}