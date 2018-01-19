package com.danielev86.procycling.controller.dto;

import java.io.Serializable;

public class TeamDetailDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String teamName;
	
	private String teamManager;
	
	private CountryDTO country;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamManager() {
		return teamManager;
	}

	public void setTeamManager(String teamManager) {
		this.teamManager = teamManager;
	}

	public CountryDTO getCountry() {
		return country;
	}

	public void setCountry(CountryDTO country) {
		this.country = country;
	}

}
