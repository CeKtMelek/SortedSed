package at.jku.ce;

public class DomainObject {

	public String uuid;
	private String name;	

	/**
	 * Default constructor
	 */
	public DomainObject() {
		super();
	}
	public DomainObject(String id) {
		super();
		this.uuid = id;
	}

	public String getUuid() {
		return uuid;
	}

}
