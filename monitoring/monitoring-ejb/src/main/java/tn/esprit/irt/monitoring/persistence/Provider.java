package tn.esprit.irt.monitoring.persistence;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Provider
 *
 */
@Entity

public class Provider extends User implements Serializable {

	private String logo;
	private static final long serialVersionUID = 1L;

	public Provider() {
		super();
	}

	public Provider(String name, String logo) {
		super(name);
		this.logo = logo;
	}

	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

}
