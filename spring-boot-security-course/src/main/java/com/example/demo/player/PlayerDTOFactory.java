package com.example.demo.player;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class PlayerDTOFactory {

    public static PlayerDTO toDTO(Player player){
        return PlayerDTO.builder()
                .id(player.getId())
                .first_name(player.getFirst_name())
                .last_name(player.getLast_name())
                .height(player.getHeight())
                .position(player.getPosition())
                .stats(player.getStats())
                .build();
    }

    public Player toEntity(PlayerDTO dto){
        return Player.builder()
                .id(dto.getId())
                .first_name(dto.getFirst_name())
                .last_name(dto.getLast_name())
                .height(dto.getHeight())
                .position(dto.getPosition())
                .stats(dto.getStats())
                .build();
    }

}
