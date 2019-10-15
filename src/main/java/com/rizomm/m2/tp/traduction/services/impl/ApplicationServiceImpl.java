package com.rizomm.m2.tp.traduction.services.impl;

import com.rizomm.m2.tp.traduction.entites.Application;
import com.rizomm.m2.tp.traduction.repositories.ApplicationRepository;
import com.rizomm.m2.tp.traduction.services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl  implements ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    @Override
    public Application createApp(Application application) {
        return applicationRepository.save(application);
    }
}
