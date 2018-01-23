package com.danielev86.procycling.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.stereotype.Service;

import com.danielev86.procycling.backend.ITeamDAO;
import com.danielev86.procycling.backend.bo.TeamBO;
import com.danielev86.procycling.controller.dto.TeamDTO;
import com.danielev86.procycling.controller.dto.TeamDetailDTO;
import com.danielev86.procycling.converter.TeamDTOConverter;
import com.danielev86.procycling.converter.TeamDetailDTOConverter;
import com.danielev86.procycling.service.ITeamService;

@Service("teamService")
public class TeamServiceImpl implements ITeamService {

	private static final long serialVersionUID = 1L;

	@Autowired
	private ITeamDAO teamDao;
	
	@Autowired
	@Qualifier(value="conversionService")
	private ConversionService converter;
	
	@Override
	@SuppressWarnings("unchecked")
	public List<TeamDTO> getAllTeam(){
		List<TeamBO> lstTeam = new ArrayList<>();
		List<TeamDTO> lstResult = new ArrayList<>();
		lstTeam = teamDao.getAllTeam();
		
		if (CollectionUtils.isNotEmpty(lstTeam)) {
			lstResult = (List<TeamDTO>) converter.convert(lstTeam
					, TypeDescriptor.collection(Collection.class, TypeDescriptor.valueOf(TeamBO.class))
					, TypeDescriptor.collection(List.class, TypeDescriptor.valueOf(TeamDTO.class)));
		}
		return lstResult;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<TeamDetailDTO> getAllTeamDetail(){
		List<TeamDetailDTO> lstResult = new ArrayList<>();
		List<TeamBO> lstTeam = teamDao.getAllTeam();
		
		if (CollectionUtils.isNotEmpty(lstTeam)) {
			lstResult = (List<TeamDetailDTO>) converter.convert(lstTeam
					, TypeDescriptor.collection(Collection.class, TypeDescriptor.valueOf(TeamBO.class))
					, TypeDescriptor.collection(List.class, TypeDescriptor.valueOf(TeamDetailDTO.class)));
		}
		return lstResult;
	}
	
	
	
}
