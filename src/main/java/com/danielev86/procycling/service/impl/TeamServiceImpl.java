package com.danielev86.procycling.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danielev86.procycling.backend.ITeamDAO;
import com.danielev86.procycling.backend.bo.TeamBO;
import com.danielev86.procycling.controller.dto.TeamDTO;
import com.danielev86.procycling.converter.TeamDTOConverter;
import com.danielev86.procycling.service.ITeamService;

@Service("teamService")
public class TeamServiceImpl implements ITeamService {

	@Autowired
	private ITeamDAO teamDao;
	
	@Autowired
	private TeamDTOConverter teamDTOConverter;
	
	@Override
	public List<TeamDTO> getAllTeam(){
		List<TeamBO> lstTeam = new ArrayList<>();
		List<TeamDTO> lstResult = new ArrayList<>();
		lstTeam = teamDao.getAllTeam();
		
		if (CollectionUtils.isNotEmpty(lstTeam)) {
			for (TeamBO team : lstTeam) {
				lstResult.add(teamDTOConverter.convert(team));
			}
		}
		return lstResult;
	}
	
	
	
}
