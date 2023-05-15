package com.elwgomes.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elwgomes.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
