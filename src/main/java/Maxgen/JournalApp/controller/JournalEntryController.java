package Maxgen.JournalApp.controller;

import Maxgen.JournalApp.entity.JournalEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {


    @GetMapping
    public List<JournalEntity> getall() {


    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntity journalEntity) {


    }

    @GetMapping("/{id}")
    public List<JournalEntity> getBylJournalEntry(@PathVariable Long id) {
        return Collections.singletonList(map.get(id));
    }

    @DeleteMapping("/{id}")
    public JournalEntity deleteJournalEntryById(@PathVariable Long id) {

    }

    @PutMapping("/{id}")
    public JournalEntity updateJournalEntryById(@PathVariable Long id, @RequestBody JournalEntity journalEntity) {

    }

}
