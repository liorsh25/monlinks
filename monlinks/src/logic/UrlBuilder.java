package logic;

import org.apache.log4j.Logger;

import servlets.RedirectServlet;
import model.IShoppingSite;
import model.ISubscriber;
import model.affiliateCompany.IAffiliateCompany;

public class UrlBuilder {
	private static Logger logger = Logger.getLogger(RedirectServlet.class);
	
	public static String buildRedirectUrl(String destinationUrl, ISubscriber subscriber, IShoppingSite shoppingSite){
		String redirectUrl = destinationUrl;
		//TODO: go to affiliation url with our key and referal url
		if (subscriber == null || shoppingSite == null){
			logger.error("subscriber or shoppingSite is null");
		}else{
			redirectUrl = shoppingSite.getAffiliateCompany().calcAffiliatedUrl(subscriber.getAffiliationSId(), destinationUrl);
		}
		return redirectUrl;
	}
}
