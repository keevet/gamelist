package com.gamelist.dto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gamelist.dto.GameMinDTO;
import com.gamelist.dto.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		
		return  gameService.findAll();
		

	}
	
}
