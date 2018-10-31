package picshare.domain;

import java.util.ArrayList;

public class PictureService {
/*private ServantDao dao=new ServantDaoImpl();*/
private DataSource data=new DataSource();

public ArrayList<Picture> getAllPictures(){
	ArrayList<Picture>pictures=new ArrayList<Picture>();
	for(User u: data.getData()) {
		for (Picture p:u.getWorks()) {
			pictures.add(p);
		}
	}
	return pictures;
}
public Picture getPictureById(int id) {
	Picture result=null;
	for(User u: data.getData()) {
		for (Picture p:u.getWorks()) {
			if(p.getId()==id) {
				result=p;
			}
		}
	}
	return result;
}
public ArrayList<User> getAllUsers(){
	return data.getData();
}
public User getUserById(int id) {
	User result=null;
	for(User u: data.getData()) {
			if(u.getId()==id) {
				result=u;
			}
	}
	return result;
}
public User getUserByName(String name) {
	User result=null;
	for(User u: data.getData()) {
			if(u.getUsername().equals(name)) {
				result=u;
			}
	}
	return result;
}
}
