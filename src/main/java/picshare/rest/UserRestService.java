package picshare.rest;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import picshare.domain.Comment;
import picshare.domain.Picture;
import picshare.domain.PictureService;
import picshare.domain.ServiceProvider;
import picshare.domain.User;

	@Path("/users")
	public class UserRestService {
			PictureService service=ServiceProvider.getPictureService();

			@GET
			@Produces("application/json")
			public String UserList(@QueryParam("batch")int batch ) {
				JsonArrayBuilder jab = Json.createArrayBuilder();
				ArrayList<User>userlist=new ArrayList<User>();
				for (User user:service.getAllUsers()) {
					if (!user.getWorks().isEmpty()) {
						userlist.add(user);
					}
				}
				int batchend=batch+4;
				if (batchend>userlist.size()) {
					batchend=userlist.size();
				}if (batch<=userlist.size()) {
				ArrayList<User> result = new ArrayList<User>(userlist.subList(batch,batchend));
				for (User u : result) {
					jab.add(createJson(u));
				}

				JsonArray array = jab.build();

				return (array.toString());
				}else {
					return null;
				}
			}

			@Path("{id}")
			@GET
			@Produces("application/json")
			public String getUserByID(@PathParam("id") int id) {

				User u=service.getUserById(id);
				if (u!=null){
					return(createJson(u).build().toString());
				}
				else{
				throw new WebApplicationException(Response.Status.NOT_FOUND);
			}
				}
			@Path("/find/{username}")
			@GET
			@Produces("application/json")
			public String getUserByUsername(@PathParam("username") String username) {
				for (User u: service.getAllUsers()) {
				if (u.getUsername().equals(username)){
					return(createJson(u).build().toString());
				}}
				throw new WebApplicationException(Response.Status.NOT_FOUND);
			}
			@Path("/find/pic/{picid}")
			@GET
			@Produces("application/json")
			public String getUserByPicture(@PathParam("picid") int id) {
				User result=null;
				for (User u:service.getAllUsers()) {
					for (Picture p:u.getWorks()) {
						if (p.getId()==id) {
							result=u;
						}
					}
				}
				return createJson(result).build().toString();
			}
			public JsonObjectBuilder createJson(User u){
				JsonObjectBuilder job = Json.createObjectBuilder();
				JsonObjectBuilder jobpic = Json.createObjectBuilder();
				JsonObjectBuilder joball = Json.createObjectBuilder();
				JsonObjectBuilder jobcom = Json.createObjectBuilder();
				int totalviews=0;
				int totallikes=0;
				int totalillus=0;
				for (Picture p:u.getWorks()) {
					totalillus+=1;
					totallikes+=p.getLikes();
					totalviews+=p.getViews();
				}
				SimpleDateFormat dt1 = new SimpleDateFormat("dd-mm-yyyy");
				job.add("id", u.getId());
				job.add("username", u.getUsername());
				job.add("email", u.getEmail());
				job.add("birthday", dt1.format(u.getBirthday()));
				job.add("home", u.getHome());
				job.add("description", u.getDescription());
				job.add("illustrations", totalillus);
				job.add("likes", totallikes);
				job.add("views", totalviews);
				JsonArrayBuilder jab = Json.createArrayBuilder();
				JsonArrayBuilder jab2=Json.createArrayBuilder();
				JsonArrayBuilder jab3=Json.createArrayBuilder();
				ArrayList<Picture> sublist=new ArrayList<Picture>();
				if (u.getWorks().size()<4){
					sublist = new ArrayList<Picture>(u.getWorks().subList(0, u.getWorks().size()));
				}else {
				    sublist = new ArrayList<Picture>(u.getWorks().subList(0, 4));
				}
				for (Picture p:sublist) {
					jobpic.add("id", p.getId());
					jobpic.add("title", p.getTitle());
					jab.add(jobpic);
				}for (Picture p:u.getWorks()) {
					joball.add("id", p.getId());
					joball.add("title", p.getTitle());
					jab3.add(joball);
				}
				for (Comment c:u.getComments()) {
					jobcom.add("id", c.getId());
					jobcom.add("author", c.getAuthor());
					jobcom.add("authorid", service.getUserByName(c.getAuthor()).getId());
					jobcom.add("content", c.getContent());
					jab2.add(jobcom);
				}
				job.add("works", jab);
				job.add("comments", jab2);
				job.add("allworks", jab3);
				return job;
			}
	}
