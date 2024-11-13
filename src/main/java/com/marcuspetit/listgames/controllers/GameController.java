package com.marcuspetit.listgames.controllers;

import com.marcuspetit.listgames.entities.Game;
import com.marcuspetit.listgames.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {
    @Autowired
    private GameService gameService;
    
    @GetMapping
    public List<Game> findeAll() {
        List<Game> result = gameService.findeAll();
        return result;
    }
}
