package tn.esprit.irt.monitoring.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Offer
 *
 */
@Entity

public class Offer implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "offer")
	private List<SlaLigne> slaLignes;
	@OneToMany(mappedBy = "offer")
	private List<MetricDetail> metricDetails;

	public Offer() {
		super();
	}

	public Offer(String name) {
		super();
		this.name = name;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<SlaLigne> getSlaLignes() {
		return slaLignes;
	}

	public void setSlaLignes(List<SlaLigne> slaLignes) {
		this.slaLignes = slaLignes;
	}

	public List<MetricDetail> getMetricDetails() {
		return metricDetails;
	}

	public void setMetricDetails(List<MetricDetail> metricDetails) {
		this.metricDetails = metricDetails;
	}
}
