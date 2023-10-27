package com.techproeducation.backendproject.initialwork.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
public class ContactMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Email
    private String email;
    @NotNull
    private String name;
    @NotNull
    private String subject;
    @NotNull
    private String message;
    @NotNull
    private LocalDateTime dateTime;
}
