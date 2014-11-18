package helpers;

public class RestLikeUrlAnalyzer extends UrlAnalyzer {

	private String[] restArr = null;
	private String destinationUr = null;
	
	public RestLikeUrlAnalyzer(String urlStringToAnalayz) {
		super(urlStringToAnalayz);
		restArr = urlStringToAnalayz.split("/");
		String[] destinationUrlArr = urlStringToAnalayz.split("/@u=");
		if(destinationUrlArr.length == 2){
			destinationUr = destinationUrlArr[1];
			if(destinationUr.startsWith("http")){
				//for some reason remove one "/" from the http://
				destinationUr = destinationUr.replace(":/", "://");
			}else{
				destinationUr = "http://"+destinationUr;
			}
		}
	}

	@Override
	public String getDestinationUrl() {
		//for example: monlinks.com/r/hufsha001/ci/up/14102014/ct/@u=http://il.nextdirect.com/en/g67144s8
		return destinationUr;
	}

	@Override
	public String getSubcriberKey() {
		return restArr[1];
	}

}
