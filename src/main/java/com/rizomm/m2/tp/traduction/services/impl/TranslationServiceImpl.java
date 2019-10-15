package com.rizomm.m2.tp.traduction.services.impl;

import com.rizomm.m2.tp.traduction.entites.Translation;
import com.rizomm.m2.tp.traduction.repositories.TranslationRepository;
import com.rizomm.m2.tp.traduction.services.TranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranslationServiceImpl implements TranslationService {

    @Autowired
    private TranslationRepository translationRepository;

    @Override
    public Translation createTrans(Translation translation) {
        return translationRepository.save(translation);
    }
}
