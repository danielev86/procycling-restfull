package com.danielev86.procycling.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.danielev86.procycling.backend.bo.TeamBO;
import com.danielev86.procycling.controller.dto.CountryDTO;
import com.danielev86.procycling.controller.dto.TeamDetailDTO;

@Component
public class TeamDetailDTOConverter implements Converter<TeamBO, TeamDetailDTO> {

	@Override
	public TeamDetailDTO convert(TeamBO source) {
		TeamDetailDTO target = new TeamDetailDTO();
		target.setId(source.getId());
		target.setTeamName(source.getTeamName());
		target.setTeamManager(source.getTeamManager());
		CountryDTO countryTarget = new CountryDTO();
		countryTarget.setId(source.getCountry().getId());
		countryTarget.setCountryName(source.getCountry().getCountryName());
		target.setCountry(countryTarget);
		return target;
	}

}
