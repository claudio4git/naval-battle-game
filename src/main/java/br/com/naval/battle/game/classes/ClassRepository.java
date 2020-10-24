package br.com.naval.battle.game.classes;

import br.com.naval.battle.game.entities.Classes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ClassRepository {

    @Autowired
    private JdbcTemplate template;

    public void create(Classes classes) {

        template.execute("INSERT");

    }
}
