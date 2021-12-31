package tn.essat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Currencie {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
	private String currency;
	public Currencie(Integer id, String currency) {
		super();
		this.id = id;
		this.currency = currency;
	}
	public Currencie() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
}
