package model.affiliateCompany;

public interface IAffiliateCompany {

	public abstract String calcAffiliatedUrl(String subscriberId,String destinationUrl);

	// TODO: add here abstruct API methods (get affiliate data by
	// dates/revenue...

	public String getName();

	public void setName(String name);

	public String getDeepLinkUrl();

	public void setDeepLinkUrl(String deepLinkUrl);

}