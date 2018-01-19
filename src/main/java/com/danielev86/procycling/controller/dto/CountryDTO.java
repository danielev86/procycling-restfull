package com.danielev86.procycling.controller.dto;

import java.io.Serializable;

public class CountryDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String countryName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
}
