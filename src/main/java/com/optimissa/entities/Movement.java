package com.optimissa.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Movement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	@ManyToOne
	private String dni;
	private String base;
	private double amount;
	private Date date;
	private Map<String, Double> rates;
	
	public Movement() {
		
	}

	public Movement(int id, String base, double amount, Date date, Map<String, Double> rates) {
		super();
		this.id = id;
		this.base = base;
		this.amount = amount;
		this.date = date;
		this.rates = rates;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Map<String, Double> getRates() {
		return rates;
	}

	public void setRates(Map<String, Double> rates) {
		this.rates = rates;
	}

	@Override
	public String toString() {
		return "Movement [id=" + id + ", base=" + base + ", amount=" + amount + ", date=" + date + ", rates=" + rates
				+ "]";
	}
	
}
