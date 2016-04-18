package tn.esprit.irt.monitoring.persistence;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Metric
 *
 */
@Entity

public class Metric implements Serializable {

	   
	@Id
	private Integer id;
	private String name;
	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "metric")
	private List<MetricDetail> metricDetails;
	public Metric() {
		super();
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
	public List<MetricDetail> getMetricDetails() {
		return metricDetails;
	}
	public void setMetricDetails(List<MetricDetail> metricDetails) {
		this.metricDetails = metricDetails;
	}
   
}
