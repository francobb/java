package com.example.demo.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PlayerRepository extends JpaRepository<Player, UUID> {
    @Override
    List<Player> findAll();

    List<Player> findAllById(UUID id);
}
