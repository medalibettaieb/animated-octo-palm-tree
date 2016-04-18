package tn.esprit.irt.monitoring.persistence;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: SlaLigne
 *
 */
@Entity

public class SlaLigne implements Serializable {
	@EmbeddedId
	private SlaLigneId id;
	private String typeOfSla;
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "idOffer", referencedColumnName = "id", insertable = false, updatable = false)
	private Offer offer;
	@ManyToOne
	@JoinColumn(name = "idProvider", referencedColumnName = "id", insertable = false, updatable = false)
	private User provider;
	@ManyToOne
	private User client;

	public SlaLigne() {
		super();
	}

	public SlaLigne(String typeOfSla, Offer offer, User provider) {
		super();
		this.typeOfSla = typeOfSla;
		this.offer = offer;
		this.provider = provider;
		this.id = new SlaLigneId(provider.getId(), offer.getId());
	}

	public String getTypeOfSla() {
		return this.typeOfSla;
	}

	public void setTypeOfSla(String typeOfSla) {
		this.typeOfSla = typeOfSla;
	}

	public User getProvider() {
		return provider;
	}

	public void setProvider(User provider) {
		this.provider = provider;
	}

	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	public SlaLigneId getId() {
		return id;
	}

	public void setId(SlaLigneId id) {
		this.id = id;
	}

	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}

}
