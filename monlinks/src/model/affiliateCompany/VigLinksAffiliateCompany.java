package model.affiliateCompany;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class VigLinksAffiliateCompany extends AbstractAffiliateCompany {

	public VigLinksAffiliateCompany(String name, String deepLinkUrl) {
		super(name, deepLinkUrl);
		// TODO Auto-generated constructor stub
	}

	/**
	 * VigLinks API: http://support.viglink.com/entries/20646001-API-Documentation
	 * http://api.viglink.com/api/click?key=<your API key>&out=<URL>&loc=<URL>[&cuid=<str>][&format=go|jsonp|txt][&jsonp=<str>][&reaf=1][&ref=<URL>][&title=<str>][&txt=<str>]
	 * Example:http://api.viglink.com/api/click?key=3a0aad395b02941d447b234383bed775&out=<URL>&loc=<URL>[&cuid=<str>][&format=go|jsonp|txt][&jsonp=<str>][&reaf=1][&ref=<URL>][&title=<str>][&txt=<str>]
	 */
	@Override
	public String calcAffiliatedUrl(String subscriberId, String destinationUrl) {
		String retUrl = destinationUrl;
		try {
			URLEncoder.encode(destinationUrl, "UTF-8");
			//retUrl = deepLinkUrl +"?key="+subscriberId+"&out="+destinationUrl+"&loc=hufshatleida.co.il&format=text";
			retUrl = deepLinkUrl +"?key="+subscriberId+"&out="+destinationUrl;
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retUrl;
	}

}
