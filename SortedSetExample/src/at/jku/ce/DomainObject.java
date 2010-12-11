package at.jku.ce;

public class DomainObject {

	private String uuid = UUID.randomUUID().toString();
	private String name;	

	/**
	 * Default constructor
	 */
	public DomainObject() {
		super();
	}
	public DomainObject(String name, String comment) {
		super();
		this.name = name;
	}

	public String getUuid() {
		return uuid;
	}

}
