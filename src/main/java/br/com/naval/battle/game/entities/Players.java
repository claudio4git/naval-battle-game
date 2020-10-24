package br.com.naval.battle.game.entities;

import lombok.Data;

import java.util.UUID;

@Data
public class Players {
    private UUID id;
    private String name;
    private Boolean classOwner;
}
