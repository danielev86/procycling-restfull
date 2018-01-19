package com.danielev86.procycling.service;

import java.io.Serializable;
import java.util.List;

import com.danielev86.procycling.controller.dto.TeamDTO;
import com.danielev86.procycling.controller.dto.TeamDetailDTO;

public interface ITeamService extends Serializable {

	List<TeamDTO> getAllTeam();

	List<TeamDetailDTO> getAllTeamDetail();

}
