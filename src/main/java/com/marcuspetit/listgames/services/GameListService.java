package com.marcuspetit.listgames.services;

import com.marcuspetit.listgames.dto.GameListDTO;
import com.marcuspetit.listgames.entities.GameList;
import com.marcuspetit.listgames.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    // Recupera uma lista de todos os jogos e os mapeia para uma lista de objetos GameMinDto
    @Transactional(readOnly = true)
    public List<GameListDTO> findeAll() {
        try {
            List<GameList> result = gameListRepository.findAll();
            return result.stream().map(GameListDTO::new).toList();
        } catch (Exception e) {
            throw new RuntimeException("Failed to retrieve the list of games", e);
        }
    }

    public GameListDTO findById(Long id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("O id da lista de jogos precisa ser válido");
        }
        GameList result = gameListRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Lista de jogos não encontrada para o id: " + id));
        return new GameListDTO(result);
    }

}
