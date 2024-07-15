package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ContactUs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idContact;
    private String fullname;
    private String email;
    private Subject subject;
    private String Message;

}
