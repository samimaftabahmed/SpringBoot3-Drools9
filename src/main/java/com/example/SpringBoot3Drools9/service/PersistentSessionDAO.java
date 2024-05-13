package com.example.SpringBoot3Drools9.service;


import com.example.SpringBoot3Drools9.repository.DroolsSessionRepository;
import org.drools.persistence.info.SessionInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersistentSessionDAO {

    @Autowired
    private DroolsSessionRepository droolsSessionRepository;

    public List<SessionInfo> getSessionDetails() {

//        org.drools.persistence.info.WorkItemInfo

        return droolsSessionRepository.findAll();
    }
}
