package picshare.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
private int id;
private String username;
private Date birthday;
private String email;
private String home;
private String password;
private String description;
private List<Picture>works;
private List<User>following;
private List<Comment>comments;

public User(int id,  String username, String email, Date birthday, String home, String password, String description) {
	super();
	this.id = id;
	this.username = username;
	this.birthday=birthday;
	this.email=email;
	this.home=home;
	this.password = password;
	this.description = description;
	this.works = new ArrayList<>();
	this.following=new ArrayList<>();
	this.comments=new ArrayList<>();
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public Date getBirthday() {
	return birthday;
}

public void setBirthday(Date birthday) {
	this.birthday = birthday;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public List<Picture> getWorks() {
	return works;
}

public void setWorks(List<Picture> works) {
	this.works = works;
}
public void addWork(Picture pic) {
	this.works.add(pic);
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getHome() {
	return home;
}

public void setHome(String home) {
	this.home = home;
}

public List<User> getFollowing() {
	return following;
}

public void setFollowing(List<User> following) {
	this.following = following;
}
public void addFollowing(User following) {
	this.following.add(following);
}
public List<Comment> getComments() {
	return comments;
}
public void setComments(List<Comment> following) {
	this.comments = following;
}
public void addComments(Comment following) {
	this.comments.add(following);
}

}
