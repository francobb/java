package com.example.demo.player;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Player {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String name;
    private String height;
    private String position;
//    private Stats stats;


}
