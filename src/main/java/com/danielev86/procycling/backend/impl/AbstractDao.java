package com.danielev86.procycling.backend.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public abstract class AbstractDao<T extends Serializable> {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	private Class<T> classz;
	
	@SuppressWarnings("unchecked")
	public List<T> findAll(){
		StringBuffer hqlQuery = new StringBuffer();
		hqlQuery.append(" select item ")
		.append(" from ")
		.append(classz.getSimpleName())
		.append(" item ");
		
		return (List<T>) getEntityManager().createQuery(hqlQuery.toString()).getResultList();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public Class<T> getClassz() {
		return classz;
	}

	public void setClassz(Class<T> classz) {
		this.classz = classz;
	}
}
