package com.danielev86.procycling.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.danielev86.procycling.backend.bo.TeamBO;
import com.danielev86.procycling.controller.dto.TeamDTO;

@Component
public class TeamDTOConverter implements Converter<TeamBO, TeamDTO> {

	@Override
	public TeamDTO convert(TeamBO source) {
		TeamDTO target = new TeamDTO();
		target.setId(source.getId());
		target.setTeamManager(source.getTeamManager());
		target.setTeamName(source.getTeamName());
		return target;
	}

}
