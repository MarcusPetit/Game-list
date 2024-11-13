package com.marcuspetit.listgames.services;

import com.marcuspetit.listgames.dto.GameDTO;
import com.marcuspetit.listgames.dto.GameMinDto;
import com.marcuspetit.listgames.entities.Game;
import com.marcuspetit.listgames.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findeAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDto::new).toList();
    }

    public GameDTO findById(Long id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("O id do game precisa ser válido");
        }
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }
}
