package com.techproeducation.backendproject.initialwork.repository;

import com.techproeducation.backendproject.initialwork.entity.ContactMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ContactMessageRepository extends JpaRepository<ContactMessage, Long> {
    List<ContactMessage> findByEmail(String email);
    List<ContactMessage> findBySubjectContaining(String subject);
    List<ContactMessage> findByDateTimeBetween(LocalDateTime start, LocalDateTime end);
}
