package picshare.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Picture {
private int id;
private String title;
private String description;
private Date publication;
private int likes;
private int views;
private List<Comment>comments;

public Picture(int id, String title, String description, Date publication) {
	super();
	this.id = id;
	this.title = title;
	this.description = description;
	this.publication = publication;
	this.likes = 0;
	this.views=0;
	this.comments = new ArrayList<>();
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

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public Date getPublication() {
	return publication;
}

public void setPublication(Date publication) {
	this.publication = publication;
}

public int getLikes() {
	return likes;
}

public void setLikes(int likes) {
	this.likes = likes;
}
public int getViews() {
	return views;
}

public void setViews(int views) {
	this.views = views;
}

public List<Comment> getComments() {
	return comments;
}

public void setComments(List<Comment> comments) {
	this.comments = comments;
}
public void addComment(Comment c) {
	this.comments.add(c);
}

}
