package com.example.demo.player;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PlayerService {

    PlayerRepository playerRepository;

    public List<Player> getAllPlayers() {
        List<Player> playerList =  Arrays.asList(new Player(), new Player());
        return playerRepository.findAll();
    }
}
