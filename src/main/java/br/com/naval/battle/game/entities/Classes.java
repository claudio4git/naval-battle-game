package br.com.naval.battle.game.entities;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class Classes {
    private UUID id;
    private String name;
    private List<Players> players;
}
