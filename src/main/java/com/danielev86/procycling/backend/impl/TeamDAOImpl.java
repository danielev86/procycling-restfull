package com.danielev86.procycling.backend.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.danielev86.procycling.backend.ITeamDAO;
import com.danielev86.procycling.backend.bo.TeamBO;

@Repository("teamDao")
@Transactional
public class TeamDAOImpl extends AbstractDao<TeamBO> implements ITeamDAO {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@SuppressWarnings("unchecked")
	public List<TeamBO> getAllTeam(){
		setClassz(TeamBO.class);
		List<TeamBO> lstTeam = this.findAll();
		return lstTeam;
	}

}
