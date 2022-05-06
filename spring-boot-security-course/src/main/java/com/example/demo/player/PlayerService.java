package com.example.demo.player;

import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
//public abstract class PlayerService {
public class PlayerService {

    private final PlayerRepository playerRepository;

//    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Player getPlayerById(String uuid){
        return playerRepository.findPlayerById(UUID.fromString(uuid));
    }

}
