package picshare.rest;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

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

import org.json.JSONArray;

import picshare.domain.Comment;
import picshare.domain.Picture;
import picshare.domain.PictureService;
import picshare.domain.ServiceProvider;
import picshare.domain.User;

@Path("/pictures")
public class PictureRestService {
		PictureService service=ServiceProvider.getPictureService();

		@GET
		@Produces("application/json")
		public String PictureList(@QueryParam("batch")int batch ) {
			JsonArrayBuilder jab = Json.createArrayBuilder();
			ArrayList<Picture>picturelist=service.getAllPictures();
			int batchend=batch+3;
			if (batchend>picturelist.size()) {
				batchend=picturelist.size();
			}if (batch<=picturelist.size()) {
			ArrayList<Picture> result = new ArrayList<Picture>(picturelist.subList(batch,batchend ));
			for (Picture p : result) {
				jab.add(createJson(p));
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
		public String getPictureByID(@PathParam("id") int id) {

			Picture p=service.getPictureById(id);
			if (p!=null){
				return(createJson(p).build().toString());
			}
			else{
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
			}
		public JsonObjectBuilder createJson(Picture p){
			JsonObjectBuilder job = Json.createObjectBuilder();
			JsonObjectBuilder jobcom = Json.createObjectBuilder();
			SimpleDateFormat dt1 = new SimpleDateFormat("dd-mm-yyyy");
			job.add("id", p.getId());
			job.add("title", p.getTitle());
			job.add("description", p.getDescription());
			job.add("publication", dt1.format(p.getPublication()));
			job.add("likes", p.getLikes());
			job.add("views", p.getViews());
			
			JsonArrayBuilder jab = Json.createArrayBuilder();
			for (Comment c:p.getComments()) {
				jobcom.add("id", c.getId());
				jobcom.add("author", c.getAuthor());
				User u=service.getUserByName(c.getAuthor());
				jobcom.add("authorid", u.getId());
				jobcom.add("content", c.getContent());
				jab.add(jobcom);
			}
			job.add("comments", jab);
			return job;
		}
}