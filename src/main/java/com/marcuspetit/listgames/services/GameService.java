package com.marcuspetit.listgames.services;

import com.marcuspetit.listgames.dto.GameDTO;
import com.marcuspetit.listgames.dto.GameMinDto;
import com.marcuspetit.listgames.entities.Game;
import com.marcuspetit.listgames.projections.GameMinProjection;
import com.marcuspetit.listgames.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    // Recupera uma lista de todos os jogos e os mapeia para uma lista de objetos GameMinDto
    @Transactional(readOnly = true)
    public List<GameMinDto> findeAll() {
        try {
            List<Game> result = gameRepository.findAll();
            return result.stream().map(GameMinDto::new).toList();
        } catch (Exception e) {
            throw new RuntimeException("Failed to retrieve the list of games", e);
        }
    }

    //leitura de dados em memória somente leitura por id, se nao existir lanca uma excecao
    //o get() lanca uma excecao caso o id nao exista
    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("O id do game precisa ser válido");
        }
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    // Recupera uma lista de jogos pertencentes a uma lista específica e os mapeia para uma lista de objetos GameMinDto
    @Transactional(readOnly = true)
    public List<GameMinDto> searchByList(Long listId) {
        if (listId == null || listId <= 0) {
            throw new IllegalArgumentException("O id da lista precisa ser válido");
        }
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(GameMinDto::new).toList();
    }

}
