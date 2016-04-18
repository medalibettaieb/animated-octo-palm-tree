package tn.esprit.irt.monitoring.persistence;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity

public class Client extends User implements Serializable {

	private String address;
	private static final long serialVersionUID = 1L;

	public Client() {
		super();
	}

	public Client(String name, String address) {
		super(name);
		this.address = address;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
