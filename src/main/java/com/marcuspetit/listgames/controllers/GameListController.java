package com.marcuspetit.listgames.controllers;

import com.marcuspetit.listgames.dto.GameListDTO;
import com.marcuspetit.listgames.dto.GameMinDto;
import com.marcuspetit.listgames.services.GameListService;
import com.marcuspetit.listgames.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping("/{id}")
    public GameListDTO findById(@PathVariable Long id) {
        return gameListService.findById(id);
    }


    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findeAll();
    }

    @GetMapping("/{listId}/games")
    public List<GameMinDto> searchByList(@PathVariable Long listId) {
        return gameService.searchByList(listId);
    }

}
