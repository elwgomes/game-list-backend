package com.elwgomes.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.elwgomes.dslist.dto.GameDTO;
import com.elwgomes.dslist.dto.GameListDTO;
import com.elwgomes.dslist.dto.GameMinDTO;
import com.elwgomes.dslist.entities.Game;
import com.elwgomes.dslist.entities.GameList;
import com.elwgomes.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll () {
        List<Game> list = gameRepository.findAll();
        return list.stream().map(GameMinDTO::new).toList();
    }    
    
    @Transactional(readOnly = true)
    public GameDTO findById (Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }    
}