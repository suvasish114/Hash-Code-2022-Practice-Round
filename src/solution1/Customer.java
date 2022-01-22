package solution1;

import java.util.HashSet;
import java.util.Set;

public class Customer {
	private Set<String> likes = new HashSet<String>();
	private Set<String> dislikes = new HashSet<String>();
	public Customer() {
		super();
	}
	public Customer(Set<String> likes, Set<String> dislikes) {
		super();
		this.likes = likes;
		this.dislikes = dislikes;
	}
	public Set<String> getLikes() {
		return likes;
	}
	public void setLikes(Set<String> likes) {
		this.likes = likes;
	}
	public Set<String> getDislikes() {
		return dislikes;
	}
	public void setDislikes(Set<String> dislikes) {
		this.dislikes = dislikes;
	}
	public void addLikes(String item) {
		likes.add(item);
	}
	public void addDislikes(String item) {
		dislikes.add(item);
	}
	public void trimLikes() {
		likes.removeAll(dislikes);
	}
}
