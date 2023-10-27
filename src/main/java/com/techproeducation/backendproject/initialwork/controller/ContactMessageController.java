package com.techproeducation.backendproject.initialwork.controller;

import com.techproeducation.backendproject.initialwork.dto.ContactMessageDTO;
import com.techproeducation.backendproject.initialwork.entity.ContactMessage;
import com.techproeducation.backendproject.initialwork.service.ContactMessageService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/contact-messages")
public class ContactMessageController {
    @Autowired
    private ContactMessageService service;

    @PostMapping
    public ResponseEntity<ContactMessage> createContactMessage(@Valid @RequestBody ContactMessageDTO contactMessageDTO)
    {

    }

    @GetMapping
    public ResponseEntity<List<ContactMessageDTO>> getAllContactMessages(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sort,
            @RequestParam(defaultValue = "ASC") String type) {

    }

    @GetMapping("/search/subject")
    public ResponseEntity<List<ContactMessageDTO>> searchBySubject(@RequestParam String subject) {

    }

    @GetMapping("/search/email")
    public ResponseEntity<List<ContactMessageDTO>> getByEmail(@RequestParam String email) {

    }

    @GetMapping("/search/date-range")
    public ResponseEntity<List<ContactMessageDTO>> getByDateRange(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startDate,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate endDate) {

    }

    @GetMapping("/search/time-range")
    public ResponseEntity<List<ContactMessageDTO>> getByTimeRange(
            @RequestParam @DateTimeFormat(pattern = "HH:mm") LocalTime startTime,
            @RequestParam @DateTimeFormat(pattern = "HH:mm") LocalDate endTime) {

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMessageById(@PathVariable Long id) {

    }

    @PutMapping("/{id}")
    public ResponseEntity<ContactMessageDTO> updateContactMessage(@PathVariable Long id, @RequestBody ContactMessageDTO updatedMessage) {

    }
}
