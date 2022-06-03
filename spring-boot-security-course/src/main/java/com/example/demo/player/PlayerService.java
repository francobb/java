package com.example.demo.player;

import com.example.demo.stats.StatsRepository;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
//public abstract class PlayerService {
public class PlayerService {

    private final PlayerRepository playerRepository;
    private final StatsRepository statsRepository;

//    @Autowired
    public PlayerService(PlayerRepository playerRepository, StatsRepository statsRepository) {
        this.playerRepository = playerRepository;
        this.statsRepository = statsRepository;
    }

    public List<Player> getAllPlayers() {
        var playersReturned = playerRepository.findAll();

//        playersReturned.stream().map(player -> )

        return playerRepository.findAll();
    }

    public Player getPlayerById(String uuid){
        return playerRepository.findPlayerById(UUID.fromString(uuid));
    }

    public void deletePlayerById(String uuid){
         playerRepository.deleteById(UUID.fromString(uuid));
    }

}
