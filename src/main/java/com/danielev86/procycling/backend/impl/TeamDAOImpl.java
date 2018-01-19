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
public class TeamDAOImpl implements ITeamDAO {
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@SuppressWarnings("unchecked")
	public List<TeamBO> getAllTeam(){
		StringBuffer hqlQuery = new StringBuffer();
		hqlQuery.append(" SELECT t ")
		.append(" FROM TeamBO t ");
		
		List<TeamBO> lstTeam = entityManager.createQuery(hqlQuery.toString()).getResultList();
		return lstTeam;
	}

}
