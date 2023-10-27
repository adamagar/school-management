package com.techproeducation.backendproject.initialwork.service;

import com.techproeducation.backendproject.initialwork.repository.ContactMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactMessageService {
    @Autowired
    private ContactMessageRepository repository;
}
