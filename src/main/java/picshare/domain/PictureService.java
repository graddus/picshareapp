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
		User u7=new User(7,"FestivalPhotography","festivalphotography@gmail.com",date=format.parse("July 4, 1997"),"Canada","test","I'm a festival regular and I like to take a lot of photos of the festivals i attend");
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
		Picture p12=new Picture(12,"Philippines Rice Fields","A Photo of one of the many rice fields in the Philippines",new Date()); p12.setLikes(624);p12.setViews(5643);
		Picture p13=new Picture(13,"Mt. Mayon", "A photo of the volcano Mayon, taken in the Philippines",new Date());p13.setLikes(321);p13.setViews(6231);
		Picture p14=new Picture(14,"Manila Harbor","A photo of the harbor of the biggest city in the Philippines",new Date());p14.setLikes(624);p14.setViews(7342);
		Picture p15=new Picture(15,"Ultra Music Festival Set1","Taken at the Canna Stage of the Ultra Music Festival",new Date());p15.setLikes(774);p15.setViews(8123);
		Picture p16=new Picture(16,"Ultra Music Festival Set2","Taken at the Coolcat Stage of the Ultra Music Festival",new Date());p16.setLikes(874);p16.setViews(7123);
		Picture p17=new Picture(17,"Tomorrowland Set1","Taken at the Forest Stage of Tomorrowland",new Date());p17.setLikes(674);p17.setViews(6123);
		Picture p18=new Picture(18,"Coachella Set1","Taken at the Euphoria Stage of Coachella 2017",new Date());p18.setLikes(994);p18.setViews(11928);
		Picture p19=new Picture(19,"Water Fun", "Aqua and Hatsune Miku having some fun with water",new Date());p19.setLikes(456);p19.setViews(2928);
		Picture p20=new Picture(20,"Sakura & Flowers", "Sakura is sightseeing in a beautiful flowerfield",new Date());p20.setLikes(476);p20.setViews(3928);
		Picture p21=new Picture(21,"Dog Ear Maidens","Cute little maidens with dog ears!",new Date());p21.setLikes(486);p21.setViews(1928);
		Picture p22=new Picture(22,"Fate Festival","The Girls of Fate at a Japanese Festival",new Date());p22.setLikes(856);p22.setViews(6359);
		Picture p23=new Picture(23,"Fate Heroines","The Main Heroines of Fate ready for battle!",new Date());p23.setLikes(864);p23.setViews(8731);
		Comment c1=new Comment(1,"Graddus","Where was this picture taken? Would love to visit!");
		Comment c2=new Comment(2,"Altair","This photo was probably taken in the outer edge of Tokyo.");
		Comment c3=new Comment(3,"Graddus","Shit was so lit fam, the energy of the crowd was crazy");
		Comment c4=new Comment(4,"Graddus","I really like the flavor of this pic");
		Comment c5=new Comment(5,"Graddus","The art style of this work is really amazing");
		Comment c6=new Comment(6,"WorldCityPhotographing","I really like the relaxed nature of your photos. Keep up the good work!");
		Comment c7=new Comment(7,"Graddus","You are very creative with your Nendoroids. If only I could do the same...");
		Comment c8=new Comment(8,"Graddus","Did you attend the Woohah 2018 Festival? Shit was crazy!!!");
		Comment c9=new Comment(9, "ALtair","I really like the art style of your works");
		Comment c10;
		Comment c11;
		Comment c12;
		p1.addComment(c1);
		p1.addComment(c2);
		p15.addComment(c3);
		p19.addComment(c4);
		p22.addComment(c5);
		u2.addComments(c6);
		u5.addComments(c7);
		u7.addComments(c8);
		u6.addComments(c9);
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
		u2.addWork(p12);
		u2.addWork(p13);
		u4.addWork(p14);
		u7.addWork(p15);
		u7.addWork(p16);
		u7.addWork(p17);
		u7.addWork(p18);
		u5.addWork(p19);
		u5.addWork(p20);
		u5.addWork(p21);
		u3.addWork(p22);
		u3.addWork(p23);
		u1.addFollowing(u7);
		u1.addFollowing(u4);
		users=new ArrayList<User>();
		users.add(u1);
		users.add(u7);
		users.add(u2);
		users.add(u4);
		users.add(u5);
		users.add(u6);
		users.add(u3);
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
public User getUserByName(String name) {
	User result=null;
	for(User u: users) {
			if(u.getUsername().equals(name)) {
				result=u;
			}
	}
	return result;
}
}
