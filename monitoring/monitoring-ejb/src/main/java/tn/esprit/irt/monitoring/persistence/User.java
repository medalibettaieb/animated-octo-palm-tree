package tn.esprit.irt.monitoring.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_USER")
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;

	@OneToMany(mappedBy = "provider")
	private List<SlaLigne> slaLignes;

	@OneToMany(mappedBy = "client")
	private List<SlaLigne> slaClientLignes;

	public User() {
	}

	public User(String name) {

		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
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

	public List<SlaLigne> getSlaClientLignes() {
		return slaClientLignes;
	}

	public void setSlaClientLignes(List<SlaLigne> slaClientLignes) {
		this.slaClientLignes = slaClientLignes;
	}

}
