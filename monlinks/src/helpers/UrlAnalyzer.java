package helpers;

import java.net.MalformedURLException;
import java.net.URL;

public abstract class UrlAnalyzer implements IUrlAnalyzer {

	private String urlStringToAnalayz = null;
	
	
	public UrlAnalyzer(String urlStringToAnalayz) {
		super();
		this.urlStringToAnalayz = urlStringToAnalayz;
	}

	public  static String extractDomainName(String url) throws MalformedURLException{
		String retDomainName = null;
		URL destinationUrl = new URL(url);
		retDomainName = destinationUrl.getHost();
		retDomainName = retDomainName.replaceFirst("www.", "");//remove www is any
		return retDomainName;		
	}

}
