package model.affiliateCompany;

public abstract  class AbstractAffiliateCompany implements IAffiliateCompany {
private String name = null;
protected String deepLinkUrl = null;

//TODO: maybe enum


public AbstractAffiliateCompany(String name,String deepLinkUrl) {
	super();
	this.name = name;
	this.deepLinkUrl = deepLinkUrl;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getDeepLinkUrl() {
	return deepLinkUrl;
}


public void setDeepLinkUrl(String deepLinkUrl) {
	this.deepLinkUrl = deepLinkUrl;
}







}
