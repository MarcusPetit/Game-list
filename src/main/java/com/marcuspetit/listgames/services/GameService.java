package com.marcuspetit.listgames.services;

import com.marcuspetit.listgames.entities.Game;
import com.marcuspetit.listgames.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<Game> findeAll() {
        return gameRepository.findAll();
    }
}
