package com.optimissa.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String dni;
	private String name;
	private String surname;
	private double amount;
	@OneToMany
	@JoinColumn(name = "dni")
	private List<Movement> movements;
	
	public User() {
		
	}

	public User(String dni, String name, String surname, double amount, List<Movement> movements) {
		this.dni = dni;
		this.name = name;
		this.surname = surname;
		this.amount = amount;
		this.movements = movements;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public List<Movement> getMovements() {
		return movements;
	}

	public void setMovements(List<Movement> movements) {
		this.movements = movements;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
