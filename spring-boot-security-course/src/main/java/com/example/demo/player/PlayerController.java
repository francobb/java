package com.example.demo.player;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class PlayerController {

    PlayerService playerService;

    @GetMapping("/players")
    public ResponseEntity<List<Player>> getAllPlayers(HttpServletResponse response){
        try {
            List<Player> playerList = new ArrayList<>(playerService.getAllPlayers());

            if (playerList.isEmpty()) {
//                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(playerList, HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
