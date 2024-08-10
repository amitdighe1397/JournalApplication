package Maxgen.JournalApp.service;

import Maxgen.JournalApp.entity.JournalEntity;

import java.util.List;

public interface JournalService {

    public List<JournalEntity> getall();

    public boolean createEntry(JournalEntity journalEntity);

    public List<JournalEntity> getBylJournalEntry(Long id);

    public JournalEntity deleteJournalEntryById(Long id);


    public JournalEntity updateJournalEntryById(Long id, JournalEntity journalEntity);
}
