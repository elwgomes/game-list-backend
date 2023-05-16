package com.elwgomes.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elwgomes.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
