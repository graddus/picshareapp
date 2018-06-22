package picshare.domain;

public class ServiceProvider {
	private static PictureService pictureService = new PictureService();

	public static PictureService getPictureService() {
		return pictureService;
	}
}