package com.elwgomes.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.elwgomes.dslist.dto.GameListDTO;
import com.elwgomes.dslist.entities.GameList;
import com.elwgomes.dslist.repositories.GameListRepository;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;
    
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> list = gameListRepository.findAll();
        return list.stream().map(GameListDTO::new).toList();
    }
}