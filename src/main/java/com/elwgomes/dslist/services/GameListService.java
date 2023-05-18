package com.elwgomes.dslist.services;

import java.util.List;

import javax.crypto.spec.DESKeySpec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.elwgomes.dslist.dto.GameListDTO;
import com.elwgomes.dslist.entities.GameList;
import com.elwgomes.dslist.projections.GameMinProjection;
import com.elwgomes.dslist.repositories.GameListRepository;
import com.elwgomes.dslist.repositories.GameRepository;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;
   
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> list = gameListRepository.findAll();
        return list.stream().map(GameListDTO::new).toList();
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex) {
	List<GameMinProjection> list = gameRepository.searchByList(listId);
	GameMinProjection obj = list.remove(sourceIndex);
	list.add(destinationIndex, obj);	
    	int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
    	int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

	for (int i = min; i <= max; i++) {
		gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
	}

    }
}
