package com.example.demo.player;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
//@AllArgsConstructor
public class PlayerDTO implements Serializable {

    private UUID id;
    private String first_name;
    private String last_name;
    private String height;
    private String position;


    @Builder
    public PlayerDTO(UUID id, String first_name, String last_name, String height, String position) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.height = height;
        this.position = position;
    }
}
