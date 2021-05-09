package com.raulrezende.dsvendas.dto;

import java.io.Serializable;

import com.raulrezende.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Double amount;
	
	public SaleSumDTO() {
	}

	public SaleSumDTO(Seller seller, Double amount) {
		name = seller.getName();
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
