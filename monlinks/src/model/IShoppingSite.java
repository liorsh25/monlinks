package model;

import model.affiliateCompany.IAffiliateCompany;

public interface IShoppingSite {

	/**
	 * @return the name
	 */
	public abstract String getName();

	/**
	 * @param name the name to set
	 */
	public abstract void setName(String name);

	/**
	 * @return the description
	 */
	public abstract String getDescription();

	/**
	 * @param description the description to set
	 */
	public abstract void setDescription(String description);

	/**
	 * @return the domain
	 */
	public abstract String getDomain();

	/**
	 * @param domain the domain to set
	 */
	public abstract void setDomain(String domain);

	/**
	 * @return the affiliateCompany
	 */
	public abstract IAffiliateCompany getAffiliateCompany();

	/**
	 * @param affiliateCompany the affiliateCompany to set
	 */
	public abstract void setAffiliateCompany(IAffiliateCompany affiliateCompany);

	/**
	 * @return the minPercentage
	 */
	public abstract double getMinPercentage();

	/**
	 * @param minPercentage the minPercentage to set
	 */
	public abstract void setMinPercentage(double minPercentage);

	/**
	 * @return the maxPercentage
	 */
	public abstract double getMaxPercentage();

	/**
	 * @param maxPercentage the maxPercentage to set
	 */
	public abstract void setMaxPercentage(double maxPercentage);

	/**
	 * @return the logoImage
	 */
	public abstract String getLogoImage();

	/**
	 * @param logoImage the logoImage to set
	 */
	public abstract void setLogoImage(String logoImage);

}