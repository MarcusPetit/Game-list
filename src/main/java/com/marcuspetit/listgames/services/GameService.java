package com.marcuspetit.listgames.services;

import com.marcuspetit.listgames.dto.GameMinDto;
import com.marcuspetit.listgames.entities.Game;
import com.marcuspetit.listgames.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findeAll() {
        List<Game> result = gameRepository.findAll();
        return result;
    }
}
