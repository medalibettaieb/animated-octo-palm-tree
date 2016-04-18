package tn.esprit.irt.monitoring.persistence;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: MetricDetail
 *
 */
@Entity

public class MetricDetail implements Serializable {
	@EmbeddedId
	private MetricDetailId id;
	private String value;
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "idOffer", referencedColumnName = "id", insertable = false, updatable = false)
	private Offer offer;
	@ManyToOne
	@JoinColumn(name = "idMetric", referencedColumnName = "id", insertable = false, updatable = false)
	private Metric metric;

	public MetricDetail() {
		super();
	}

	public MetricDetail(String value, Offer offer, Metric metric) {
		super();
		this.value = value;
		this.offer = offer;
		this.metric = metric;
		this.id=new MetricDetailId(offer.getId(), metric.getId());
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	public Metric getMetric() {
		return metric;
	}

	public void setMetric(Metric metric) {
		this.metric = metric;
	}

}
