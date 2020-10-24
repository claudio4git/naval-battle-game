package br.com.naval.battle.game.classes;

import br.com.naval.battle.game.entities.Classes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/classes")
public class ClassController {

    @Autowired
    private ClassRepository repository;

    @PostMapping
    public void create(Classes classes) {
        repository.create(classes);
    }
}
