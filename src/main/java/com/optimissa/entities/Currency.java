package com.optimissa.entities;

import java.util.Date;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Currency {

	private String base;
	private double amount;
	//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
	private Date date;
	private Map<String, Double> rates;
	
	public Currency() {
		
	}

	public Currency(String name, double amount, Date date) {
		super();
		this.base = name;
		this.amount = amount;
		this.date = date;
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

	@Override
	public String toString() {
		return "Currency [name=" + base + ", amount=" + amount + ", date=" + date + " ]";
	}

	public Map<String, Double> getRates() {
		return rates;
	}
/*
	public void setRates(List<Rate> rates) {
		this.rates = rates;
	}
	*/
}
