package com.example.demo.player;

import com.example.demo.stats.Stats;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("management/api/v1/players")
public class ManagerController {

  private static final List<Player> PLAIRS = Arrays.asList(
      Player.builder().id(UUID.randomUUID()).first_name("Jim").last_name("Bean").height("6'3")
          .position("SG")
          .stats(Stats.builder().id(UUID.randomUUID()).ppg(22.3).fga(8.9).fgm(3.5).fta(6.1).ftm(3.2).build())
          .build(),
      Player.builder().id(UUID.randomUUID()).first_name("Bill").last_name("Cower").height("7'4")
          .position("SF")
          .stats(Stats.builder().id(UUID.randomUUID()).ppg(17.3).fga(12.3).fgm(5.1).fta(8.6).ftm(6.7).build())
          .build(),
      Player.builder().id(UUID.randomUUID()).first_name("Kobe").last_name("Last").height("6'7")
          .position("PG")
          .stats(Stats.builder().id(UUID.randomUUID()).ppg(28).fga(17.3).fgm(8.8).fta(8.8).ftm(6.3).build())
          .build(),
      Player.builder().id(UUID.randomUUID()).first_name("Bron").last_name("Jimmy").height("6'2")
          .position("PG")
          .stats(Stats.builder().id(UUID.randomUUID()).ppg(27).fga(14).fgm(6.5).fta(10).ftm(6.2).build())
          .build()
  );

  @GetMapping
  public List<Player> getAllStudents() {
    return PLAIRS;
  }

  @PostMapping
  public void registerNewPlayer(@RequestBody Player player) {
    System.out.print(player);
  }

  @DeleteMapping(path = "/{playerId}")
  public static void deletePlayer(@PathVariable("playerId") String playerId) {
    PLAIRS.stream().filter(player -> playerId.equals(player.getId().toString())).findFirst();
    System.out.println("playerId = " + playerId);
  }

  @PutMapping(path = "/{playerId}")
  public static void updatePlayer(@PathVariable("playerId") String playerId,
      @RequestBody Player player) {
    System.out.printf("%s %s%n", playerId, player);
  }

}
