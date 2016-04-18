package tn.esprit.irt.monitoring.persistence;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class SlaLigneId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idProvider;
	private Integer idOffer;

	public SlaLigneId() {
		// TODO Auto-generated constructor stub
	}

	public SlaLigneId(Integer idProvider, Integer idOffer) {
		super();
		this.idProvider = idProvider;
		this.idOffer = idOffer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idOffer == null) ? 0 : idOffer.hashCode());
		result = prime * result + ((idProvider == null) ? 0 : idProvider.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SlaLigneId other = (SlaLigneId) obj;
		if (idOffer == null) {
			if (other.idOffer != null)
				return false;
		} else if (!idOffer.equals(other.idOffer))
			return false;
		if (idProvider == null) {
			if (other.idProvider != null)
				return false;
		} else if (!idProvider.equals(other.idProvider))
			return false;
		return true;
	}

	public Integer getIdProvider() {
		return idProvider;
	}

	public void setIdProvider(Integer idProvider) {
		this.idProvider = idProvider;
	}

	public Integer getIdOffer() {
		return idOffer;
	}

	public void setIdOffer(Integer idOffer) {
		this.idOffer = idOffer;
	}

}
