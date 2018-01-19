package com.danielev86.procycling.backend;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.danielev86.procycling.backend.bo.TeamBO;

public interface ITeamDAO extends Serializable {

	List<TeamBO> getAllTeam();

}
