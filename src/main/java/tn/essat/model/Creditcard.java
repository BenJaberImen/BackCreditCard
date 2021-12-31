package tn.essat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Creditcard {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String expirationDate;
	private int cardNumber;
	private String code;
	private int montant;
	@ManyToOne
	@JoinColumn(name="currencie_id")
	private Currencie currencys;
	public Creditcard(Integer id, String name, String expirationDate, int cardNumber, String code, int montant,
			Currencie currencys) {
		super();
		this.id = id;
		this.name = name;
		this.expirationDate = expirationDate;
		this.cardNumber = cardNumber;
		this.code = code;
		this.montant = montant;
		this.currencys = currencys;
	}
	public Creditcard() {
		super();
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
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getMontant() {
		return montant;
	}
	public void setMontant(int montant) {
		this.montant = montant;
	}
	public Currencie getCurrencys() {
		return currencys;
	}
	public void setCurrencys(Currencie currencys) {
		this.currencys = currencys;
	}




}