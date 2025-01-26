package com.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamelist.dto.GameListDTO;
import com.gamelist.entities.GameList;
import com.gamelist.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;
	
	public List<GameListDTO> findAll() {
		
		List<GameList> result = gameListRepository.findAll();
		
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
	
}
