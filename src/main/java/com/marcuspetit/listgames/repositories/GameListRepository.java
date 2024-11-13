package com.marcuspetit.listgames.repositories;

import com.marcuspetit.listgames.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}