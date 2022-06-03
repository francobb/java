package com.example.demo;

import com.example.demo.player.Player;
import com.example.demo.player.PlayerRepository;
import com.example.demo.stats.Stats;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.List;

@Slf4j
@SpringBootApplication
public class DemoApplication {

  @Autowired
  PlayerRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @EventListener(ApplicationReadyEvent.class)
  public void runAfterStart() {
    List<Player> allPlayers = this.repository.findAll();
    log.info("Number of customers: " + allPlayers.size());

    Player tatum = Player.builder().first_name("Jason").last_name("Tatum").height("63")
        .position("SF").stats(Stats.builder().ppg(33).fga(18).fgm(8).fta(9).ftm(7).build()).build();

    Player bron = Player.builder().first_name("Bron").last_name("James").height("59")
        .position("SF").stats(Stats.builder().ppg(27).fga(17).fgm(6).fta(6.2).ftm(5.5).build()).build();

    Player durant = Player.builder().first_name("Luka").last_name("Magic").height("67")
        .position("PG").stats(Stats.builder().ppg(26).fga(15).fgm(5.5).fta(7).ftm(5).build()).build();

    Player brown = Player.builder().first_name("Tom").last_name("Ford").height("58")
        .position("PF").stats(Stats.builder().ppg(29).fga(13).fgm(5).fta(8).ftm(6.6).build()).build();

    Player doncic = Player.builder().first_name("Hasbro").last_name("John").height("65")
        .position("C").stats(Stats.builder().ppg(30).fga(14.7).fgm(8).fta(7).ftm(5).build()).build();

    var plairs = List.of(tatum, bron, brown, durant, doncic);
    log.info("Saving new plairs...");
		this.repository.saveAll(plairs);

    allPlayers = this.repository.findAll();
    log.info("Number of customers: " + allPlayers.size());
  }

}
