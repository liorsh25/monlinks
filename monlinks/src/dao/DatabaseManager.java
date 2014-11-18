package dao;

import helpers.UrlAnalyzer;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import servlets.RedirectServlet;
import model.ISubscriber;
import model.IShoppingSite;
import model.ShoppingSite;
import model.Subscriber;
import model.affiliateCompany.CJAffiliateCompany;
import model.affiliateCompany.GrouponAffiliateCompany;
import model.affiliateCompany.IAffiliateCompany;
import model.affiliateCompany.VigLinksAffiliateCompany;

public class DatabaseManager {
	
	private static Logger logger = Logger.getLogger(DatabaseManager.class);
	private static Map<String,IShoppingSite> shoppingSites = new HashMap<String,IShoppingSite>();
	private static Map<String,ISubscriber> subscribers = new HashMap<String,ISubscriber>();


	public static void loadData(){
		/*
		 * var next_obj ={
				"name":  {DF:"next"},
				"siteDomain": {DF:".nextdirect.com"},
		        "urlToGo" : {DF:"http://www.nextdirect.com",IL:"http://il.nextdirect.com/iw/"},//show this as the url, and build the event when click
		        "imageUrl":  "images/next.gif",
		        "percentage":  {DF:"2%"},
		        "goDirectly": true, //true=>goToSite OR false=>goToSiteInLocation
		        "deepAffiliateLink": "http://redirect.viglink.com?key=10a309a920033f8b2c751717059df529&u=[[CURRENT_URL]]",
				"itemURLAsParam": true,
				"countries": SHOW_IN_ALL_COUNTRIES
			};
			var ali_obj = {
		"name":  {DF:"aliexpress" , IL:"aliexpress"},
		"siteDomain": {DF:".aliexpress.com" , IL:".aliexpress.com"},
        "urlToGo" : {DF:"http://www.aliexpress.com" , IL:"http://www.aliexpress.com"},//show this as the url, and build the event when click
        "imageUrl":  "images/ali.jpg",
        "percentage":  {DF:"0.5%" , IL:"0.5%"},
        "goDirectly": true, //true=>goToSite OR false=>goToSiteInLocation
        "deepAffiliateLink": "http://www.anrdoezrs.net/links/7567644/type/dlg/[[CURRENT_URL]]",
		"itemURLAsParam": false,
		"countries": SHOW_IN_ALL_COUNTRIES
		};
		var groupon_obj ={
		"name":  {DF:"groupon" , IL:"groupon",NL:"groupon.nl"},
		"siteDomain": {DF:".groupon.co.il" , IL:".groupon.co.il"},
        "urlToGo" : {DF:"http://shopping.groupon.co.il/" , IL:"http://shopping.groupon.co.il/",NL:"http://www.groupon.nl"},//show this as the url, and build the event when click
        "imageUrl":  "images/groupon.jpg",
        "percentage":  {DF:"2%" , IL:"2%"},
        "goDirectly": true, //true=>goToSite OR false=>goToSiteInLocation
        "deepAffiliateLink": "http://t.groupon.com/r?tsToken=IL_AFF_0_202128_214281_0&url=[[CURRENT_URL]]%2F%3FCID%3DIL_AFF_5600_225_5383_1%26nlp%26utm_source%3DGPN%26utm_medium%3Dafl%26utm_campaign%3D202128&wid=http://tormim.com",
		"itemURLAsParam": true,
		"countries": SHOW_IN_ALL_COUNTRIES
	};
		*/
		//The affiliateCompany will be viglinks
		IAffiliateCompany viglinks = new VigLinksAffiliateCompany("vigLinks","http://redirect.viglink.com");
		IAffiliateCompany groupon = new GrouponAffiliateCompany("groupon","http://t.groupon.com/r?tsToken=IL_AFF_0_202128_214281_0&url=[[CURRENT_URL]]%2F%3FCID%3DIL_AFF_5600_225_5383_1%26nlp%26utm_source%3DGPN%26utm_medium%3Dafl%26utm_campaign%3D202128&wid=http://tormim.com");
		IAffiliateCompany cj = new CJAffiliateCompany("cj","http://www.anrdoezrs.net/links");

		//The shop will be Next
		shoppingSites.put("il.nextdirect.com", new ShoppingSite("Next Direct",".nextdirect.com","Next direct description","next.gif",viglinks,2,2));//in viglinks it written 8% (-25%)
		shoppingSites.put("aliexpress.com", new ShoppingSite("Ali Express",".aliexpress.com","aliexpress description","ali.gif",viglinks,1,1));
		logger.debug("shoppingSites="+shoppingSites);
		
		//The subscriber will be hufshatLeida
		subscribers.put("hufsha001", new Subscriber("Hufshat Leida","BLOG","3a0aad395b02941d447b234383bed775","hufsha001"));
		logger.debug("subscribers="+subscribers);
	}
	
	public static IShoppingSite findShoppingSiteObject(String url){
		String extractedDomainName = null;
		try {
			extractedDomainName = UrlAnalyzer.extractDomainName(url);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return (IShoppingSite) shoppingSites.get(extractedDomainName);
	}

	public static ISubscriber findSubscriberObject(String subcriberKey) {
		return subscribers.get(subcriberKey);
	}
}
