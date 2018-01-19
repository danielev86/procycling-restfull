package com.danielev86.procycling.service;

import java.io.Serializable;
import java.util.List;

import com.danielev86.procycling.controller.dto.TeamDTO;

public interface ITeamService extends Serializable {

	List<TeamDTO> getAllTeam();

}
