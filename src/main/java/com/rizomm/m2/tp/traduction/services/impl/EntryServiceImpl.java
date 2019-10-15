package com.rizomm.m2.tp.traduction.services.impl;

import com.rizomm.m2.tp.traduction.entites.Entry;
import com.rizomm.m2.tp.traduction.repositories.EntryRepository;
import com.rizomm.m2.tp.traduction.services.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EntryServiceImpl implements EntryService {

    @Autowired
    private EntryRepository entryRepository;

    @Override
    public Entry updateEntry(Integer id,Entry entry) {
        entry.setId(id);
      return entryRepository.save(entry);
    }

    @Override
    public Optional<Entry> getEntry(Integer id) {
        return entryRepository.findById(id);
    }

    @Override
    public void deleteEntry(Integer id) {
        entryRepository.deleteById(id);

    }
}
