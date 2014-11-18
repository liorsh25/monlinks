package model;

public class Subscriber implements ISubscriber {

	//TODO: add - billing info , personal info
	private String trafficSource = null;//TODO: make emun: BLOG,SITE,FACEBOOK ...
	private String name = "";
	private String affiliationSId = "";//to use in the affiliation url
	private String subscriberId = "";//monlink subscriber id
	
	
	
	public Subscriber(String name, String trafficSource, String affiliationSId,
			String subscriberId) {
		super();
		this.name = name;
		this.trafficSource = trafficSource;
		this.affiliationSId = affiliationSId;
		this.subscriberId = subscriberId;
	}
	/* (non-Javadoc)
	 * @see model.ISubscriber#getTrafficSource()
	 */
	public String getTrafficSource() {
		return trafficSource;
	}
	/* (non-Javadoc)
	 * @see model.ISubscriber#setTrafficSource(java.lang.String)
	 */
	public void setTrafficSource(String trafficSource) {
		this.trafficSource = trafficSource;
	}
	/* (non-Javadoc)
	 * @see model.ISubscriber#getName()
	 */
	public String getName() {
		return name;
	}
	/* (non-Javadoc)
	 * @see model.ISubscriber#setName(java.lang.String)
	 */
	public void setName(String name) {
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see model.ISubscriber#getAffiliationSId()
	 */
	public String getAffiliationSId() {
		return affiliationSId;
	}
	/* (non-Javadoc)
	 * @see model.ISubscriber#setAffiliationSId(java.lang.String)
	 */
	public void setAffiliationSId(String affiliationSId) {
		this.affiliationSId = affiliationSId;
	}
	/* (non-Javadoc)
	 * @see model.ISubscriber#getSubscriberId()
	 */
	public String getSubscriberId() {
		return subscriberId;
	}
	/* (non-Javadoc)
	 * @see model.ISubscriber#setSubscriberId(java.lang.String)
	 */
	public void setSubscriberId(String subscriberId) {
		this.subscriberId = subscriberId;
	}
	
	
}
