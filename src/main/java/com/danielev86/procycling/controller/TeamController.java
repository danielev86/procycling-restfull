package com.danielev86.procycling.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.danielev86.procycling.controller.dto.Response;
import com.danielev86.procycling.controller.dto.TeamDTO;
import com.danielev86.procycling.controller.utility.ResponseBuilder;
import com.danielev86.procycling.service.ITeamService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/team")
public class TeamController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ITeamService teamService;
	
	@RequestMapping(value="/allTeam", method=RequestMethod.GET)
	public ResponseEntity<Response<List<TeamDTO>>> getAllTeam(){		
		List<TeamDTO> lstTeam = new ArrayList<>();
		Boolean checkValue = null;
		
		try {
			lstTeam = teamService.getAllTeam();
			checkValue = Boolean.TRUE;
		}catch (Exception e) {
			checkValue = Boolean.FALSE;
		}
		
		ResponseBuilder<List<TeamDTO>> responseBuilder = new ResponseBuilder<>();

		return responseBuilder.buildResponseEntity(checkValue, lstTeam);
	}

}
