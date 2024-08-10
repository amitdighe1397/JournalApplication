package Maxgen.JournalApp.controller;

import Maxgen.JournalApp.entity.JournalEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {


    @GetMapping
    public List<JournalEntity> getall() {
        return null;

    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntity journalEntity) {
        return true;

    }

    @GetMapping("/{id}")
    public List<JournalEntity> getBylJournalEntry(@PathVariable Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public JournalEntity deleteJournalEntryById(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/{id}")
    public JournalEntity updateJournalEntryById(@PathVariable Long id, @RequestBody JournalEntity journalEntity) {
        return null;
    }

}
