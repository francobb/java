package com.example.demo.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @GetMapping("/players")
    public ResponseEntity<List<PlayerDTO>> getAllPlayers(){
        List<Player> playerList = new ArrayList<>(playerService.getAllPlayers());
        List<PlayerDTO> playerDtoList = new ArrayList<>();

        if (playerList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        playerList.forEach(p -> playerDtoList.add(PlayerDTOFactory.toDTO(p)));
        return new ResponseEntity<>(playerDtoList, HttpStatus.OK);
    }

    @GetMapping(path="/player/{playerId}")
    public ResponseEntity<PlayerDTO> getPlayerById(@PathVariable("playerId")String uuid ){
        System.out.println(uuid);
        var returnedPlayer = playerService.getPlayerById(uuid);
        if ( returnedPlayer == null){
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            System.out.println("RETURNED PLAYER:: " + returnedPlayer.getFirst_name());
            var realPlayer = PlayerDTOFactory.toDTO(returnedPlayer);
            return new ResponseEntity<>(realPlayer, HttpStatus.OK);
        }
    }
}
