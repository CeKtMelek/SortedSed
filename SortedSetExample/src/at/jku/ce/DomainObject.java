package at.jku.ce;

public class DomainObject {

	public String id = UUID.randomUUID().toString();
	private String name;	


	/**
	 * Default constructor
	 */
	public DomainObject() {
		super();
	}
	public DomainObject(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

}
