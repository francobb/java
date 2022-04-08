package com.example.demo.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PlayerRepository extends JpaRepository<Player, UUID> {

    List<Player> findAll();

    default List<Player> getAll() {
        return this.findAll();
    }

    List<Player> findPlayerById(UUID id);
}
