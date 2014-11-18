package logic;

import model.IShoppingSite;
import model.ISubscriber;
import model.affiliateCompany.IAffiliateCompany;

public class UrlBuilder {

	public static String buildRedirectUrl(String destinationUrl, ISubscriber subscriber, IShoppingSite shoppingSite){
		String redirectUrl = destinationUrl;
		//TODO: go to affiliation url with our key and referal url
		if (subscriber == null || shoppingSite == null){
			System.out.println("ERROR: subscriber or shoppingSite is null");
		}else{
			redirectUrl = shoppingSite.getAffiliateCompany().calcAffiliatedUrl(subscriber.getAffiliationSId(), destinationUrl);
		}
		return redirectUrl;
	}
}
