package model;

public interface ISubscriber {

	/**
	 * @return the trafficSource
	 */
	public abstract String getTrafficSource();

	/**
	 * @param trafficSource the trafficSource to set
	 */
	public abstract void setTrafficSource(String trafficSource);

	/**
	 * @return the name
	 */
	public abstract String getName();

	/**
	 * @param name the name to set
	 */
	public abstract void setName(String name);

	/**
	 * @return the affiliationSId
	 */
	public abstract String getAffiliationSId();

	/**
	 * @param affiliationSId the affiliationSId to set
	 */
	public abstract void setAffiliationSId(String affiliationSId);

	/**
	 * @return the subscriberId
	 */
	public abstract String getSubscriberId();

	/**
	 * @param subscriberId the subscriberId to set
	 */
	public abstract void setSubscriberId(String subscriberId);

}