package com.marcuspetit.listgames.controllers;

import com.marcuspetit.listgames.dto.GameListDTO;
import com.marcuspetit.listgames.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findeAll() {
        return gameListService.findeAll();
    }

}
