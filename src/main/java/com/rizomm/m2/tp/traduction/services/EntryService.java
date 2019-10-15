package com.rizomm.m2.tp.traduction.services;

import com.rizomm.m2.tp.traduction.entites.Entry;

import java.util.Optional;

public interface EntryService {
    Entry updateEntry (Integer id ,Entry entry);
    Optional<Entry> getEntry(Integer id);
    void deleteEntry(Integer id);
}
