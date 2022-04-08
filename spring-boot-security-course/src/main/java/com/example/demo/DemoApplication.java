package com.example.demo;

import com.example.demo.player.Player;
import com.example.demo.player.PlayerRepository;
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
	public void runAfterStart(){
		List<Player> allPlayers = this.repository.findAll();
		log.info("Number of customers: " + allPlayers.size());

//		Player playa = Player.builder().first_name("Jim").last_name("Duggart").height("63").position("PG").build();
//		log.info("Saving new customer...");
//		this.repository.save(playa);
//
//		allPlayers = this.repository.findAll();
//		log.info("Number of customers: " + allPlayers.size());
	}

}
