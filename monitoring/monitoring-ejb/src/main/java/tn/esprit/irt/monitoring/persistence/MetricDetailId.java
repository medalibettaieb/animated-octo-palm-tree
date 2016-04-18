package tn.esprit.irt.monitoring.persistence;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class MetricDetailId implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private Integer idOffer;
	private Integer idMetric;

	public MetricDetailId() {
		// TODO Auto-generated constructor stub
	}

	public MetricDetailId(Integer idOffer, Integer idMetric) {
		super();
		this.idOffer = idOffer;
		this.idMetric = idMetric;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idMetric == null) ? 0 : idMetric.hashCode());
		result = prime * result + ((idOffer == null) ? 0 : idOffer.hashCode());
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
		MetricDetailId other = (MetricDetailId) obj;
		if (idMetric == null) {
			if (other.idMetric != null)
				return false;
		} else if (!idMetric.equals(other.idMetric))
			return false;
		if (idOffer == null) {
			if (other.idOffer != null)
				return false;
		} else if (!idOffer.equals(other.idOffer))
			return false;
		return true;
	}

	public Integer getIdOffer() {
		return idOffer;
	}

	public void setIdOffer(Integer idOffer) {
		this.idOffer = idOffer;
	}

	public Integer getIdMetric() {
		return idMetric;
	}

	public void setIdMetric(Integer idMetric) {
		this.idMetric = idMetric;
	}

}
