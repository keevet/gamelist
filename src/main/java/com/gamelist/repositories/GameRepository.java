package com.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long>{

}
