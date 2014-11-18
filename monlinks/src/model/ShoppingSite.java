package model;

import model.affiliateCompany.IAffiliateCompany;

public class ShoppingSite implements IShoppingSite {

	private String name = null;
	private String description = null;
	private String domain = null;
	private IAffiliateCompany affiliateCompany = null;
	private double minPercentage = 0;
	private double maxPercentage = 0;
	private String logoImage = null;
	
	
	
	
	
	
	public ShoppingSite(String name, String domain, String description,
			String logoImage, IAffiliateCompany affiliateCompany,
			double maxPercentage, double minPercentage) {
		super();
		this.name = name;
		this.domain = domain;
		this.description = description;
		this.logoImage = logoImage;
		this.affiliateCompany = affiliateCompany;
		this.maxPercentage = maxPercentage;
		this.minPercentage = minPercentage;
	}
	/* (non-Javadoc)
	 * @see model.IShoppingSite1#getName()
	 */
	public String getName() {
		return name;
	}
	/* (non-Javadoc)
	 * @see model.IShoppingSite1#setName(java.lang.String)
	 */
	public void setName(String name) {
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see model.IShoppingSite1#getDescription()
	 */
	public String getDescription() {
		return description;
	}
	/* (non-Javadoc)
	 * @see model.IShoppingSite1#setDescription(java.lang.String)
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/* (non-Javadoc)
	 * @see model.IShoppingSite1#getDomain()
	 */
	public String getDomain() {
		return domain;
	}
	/* (non-Javadoc)
	 * @see model.IShoppingSite1#setDomain(java.lang.String)
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}
	/* (non-Javadoc)
	 * @see model.IShoppingSite1#getAffiliateCompany()
	 */
	public IAffiliateCompany getAffiliateCompany() {
		return affiliateCompany;
	}
	/* (non-Javadoc)
	 * @see model.IShoppingSite1#setAffiliateCompany(model.IAffiliateCompany)
	 */
	public void setAffiliateCompany(IAffiliateCompany affiliateCompany) {
		this.affiliateCompany = affiliateCompany;
	}
	/* (non-Javadoc)
	 * @see model.IShoppingSite1#getMinPercentage()
	 */
	public double getMinPercentage() {
		return minPercentage;
	}
	/* (non-Javadoc)
	 * @see model.IShoppingSite1#setMinPercentage(java.lang.String)
	 */
	public void setMinPercentage(double minPercentage) {
		this.minPercentage = minPercentage;
	}
	/* (non-Javadoc)
	 * @see model.IShoppingSite1#getMaxPercentage()
	 */
	public double getMaxPercentage() {
		return maxPercentage;
	}
	/* (non-Javadoc)
	 * @see model.IShoppingSite1#setMaxPercentage(java.lang.String)
	 */
	public void setMaxPercentage(double maxPercentage) {
		this.maxPercentage = maxPercentage;
	}
	/* (non-Javadoc)
	 * @see model.IShoppingSite1#getLogoImage()
	 */
	public String getLogoImage() {
		return logoImage;
	}
	/* (non-Javadoc)
	 * @see model.IShoppingSite1#setLogoImage(java.lang.String)
	 */
	public void setLogoImage(String logoImage) {
		this.logoImage = logoImage;
	}
  
}