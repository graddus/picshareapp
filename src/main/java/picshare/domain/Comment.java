package picshare.domain;

public class Comment {
private int id;
private String author;
private String content;
public Comment(int id, String author,String content) {
	super();
	this.id = id;
	this.author=author;
	this.content = content;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}

}
