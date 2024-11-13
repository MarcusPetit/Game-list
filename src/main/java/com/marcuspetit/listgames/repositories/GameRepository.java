package com.marcuspetit.listgames.repositories;

import com.marcuspetit.listgames.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}