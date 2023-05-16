package com.elwgomes.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elwgomes.dslist.dto.GameListDTO;
import com.elwgomes.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;
    
    @GetMapping
    public List<GameListDTO> findAll () {
        List<GameListDTO> list = gameListService.findAll();
        return list;
    }
}
