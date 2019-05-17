package picshare.domain;

public class ServiceProvider {
	private static PictureService pictureService = new PictureService();
	
	private ServiceProvider() {}

	public static PictureService getPictureService() {
		return pictureService;
	}
}