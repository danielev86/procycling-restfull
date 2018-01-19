package com.danielev86.procycling.controller.dto;

import java.io.Serializable;

public class TeamDTO implements Serializable {
	
	private Long id;
	
	private String teamName;
	
	private String teamManager;

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
}
