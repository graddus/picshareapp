package picshare.domain;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
/*import servant.persistence.ServantDaoImpl;*/

public class PictureService {
/*private ServantDao dao=new ServantDaoImpl();*/
	ArrayList<User>users;
	public PictureService() {
		try {
		DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
		Date date;
		User u1=new User(1,"Graddus","luccagraddushuijgens@gmail.com",date=format.parse("June 7, 1999"),"Netherlands","test","I'm a big fan of anime artwork");
		User u2=new User(2,"lack.","lack@gmail.com",date=format.parse("July 12, 1999"),"United States of America","test","An American photographer who likes to take pictures of nature");
		User u3=new User(3,"Altair","Altair@pixiv.com",date=format.parse("April 6, 1998"),"Japan","test","I am a freelancer illustrator based in Tokyo, Japan. I'm a big fan of the Fate series, so a lot of my works are based on it.");
		User u4=new User(4,"WorldCityPhotographing","info@WCP.com",date=format.parse("June 9, 1989"),"Australia","test","We are a photographing duo that aim to make the most beautiful pictures of the world's largest cities");
		User u5=new User(5,"Anneedroid","anneedroid@live.uk",date=format.parse("January 6, 2000"),"United Kingdom","test","(* ^ ω ^)Hi, I'm Anneedroid and I like Nendoroids. A lot. I like them so much that i use them as models for the most beautiful pictures you'll ever see!(* ^ ω ^)");
		User u6=new User(6,"GraphicAssets","graphicassets@gmail.com",date=format.parse("August 21, 1995"),"Germany","test","We are a small studio of artists who are dedicated to making the most beautiful paintings possible");
		User u7;
		User u8;
		User u9;
		Picture p1=new Picture(1, "Sakura Dream","A photo of the Japanese Sakura woods",new Date()); p1.setLikes(23);p1.setViews(132);
		Picture p2=new Picture(2,"Tokyo Skyline","A picture of the skyline of the biggest city in Japan",new Date());p2.setLikes(221);p2.setViews(1212);
		Picture p3=new Picture(3,"Ishtar","A drawing of Ishtar in the ocean",new Date());p3.setLikes(233);p3.setViews(1123);
		Picture p4=new Picture(4,"Sunset Tree Azusa","Azusa enjoying the view from a blooming tree",new Date());p4.setLikes(23);p4.setViews(112);
		Picture p5=new Picture(5,"October Park","This photo was taken in Helsinki, Finland",new Date());p5.setLikes(213);p5.setViews(1132);
		Picture p6=new Picture(6,"Watercolor Universe","A watercolor drawing of the universe",new Date());p6.setLikes(245);p6.setViews(1076);
		Picture p7=new Picture(7,"Green in Shanghai","A photo of the green area of China's biggest city",new Date());p7.setLikes(754);p7.setViews(8533);
		Picture p8=new Picture(8,"Winter Wonderland","This photo was taken in the southern part of Finland",new Date());p8.setLikes(962);p8.setViews(9448);
		Picture p9=new Picture(9,"Space 4K - 15 dark space textures","Stylish and beautiful looking dark background textures. Handcrafted with love.",new Date()); p9.setLikes(452);p9.setViews(6731);
		Picture p10=new Picture(10,"New Year's Eve Bangkok","A photo taken on New Year's Eve in Bangkok, with fireworks in the background",new Date());p10.setLikes(756);p10.setViews(7257);
		Picture p11=new Picture(11,"Floating by the docks","Done for practice. I redesign of an older painting to see how much I've learned recently. ",new Date());p11.setLikes(774);p11.setViews(6145);
		Picture p12;
		Picture p13;
		Picture p14;
		Picture p15;
		Picture p16;
		Picture p17;
		Picture p18;
		Picture p19;
		Picture p20;
		Picture p21;
		Comment c1=new Comment(1,"Graddus","Where was this picture taken? Would love to visit!");
		Comment c2;
		Comment c3;
		Comment c4;
		Comment c5;
		Comment c6;
		Comment c7;
		Comment c8;
		Comment c9;
		Comment c10;
		Comment c11;
		Comment c12;
		p1.addComment(c1);
		u2.addWork(p1);
		u4.addWork(p2);
		u3.addWork(p3);
		u5.addWork(p4);
		u2.addWork(p5);
		u6.addWork(p6);
		u4.addWork(p7);
		u2.addWork(p8);
		u6.addWork(p9);
		u4.addWork(p10);
		u6.addWork(p11);
		users=new ArrayList<User>();
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		users.add(u5);
		users.add(u6);
	}catch(ParseException e) {
		e.printStackTrace();
	}
	}
public ArrayList<Picture> getAllPictures(){
	ArrayList<Picture>pictures=new ArrayList<Picture>();
	for(User u: users) {
		for (Picture p:u.getWorks()) {
			pictures.add(p);
		}
	}
	return pictures;
}
public Picture getPictureById(int id) {
	Picture result=null;
	for(User u: users) {
		for (Picture p:u.getWorks()) {
			if(p.getId()==id) {
				result=p;
			}
		}
	}
	return result;
}
public ArrayList<User> getAllUsers(){
	return users;
}
public User getUserById(int id) {
	User result=null;
	for(User u: users) {
			if(u.getId()==id) {
				result=u;
			}
	}
	return result;
}
}
