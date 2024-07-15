package com.example.demo.repository;

import com.example.demo.entity.ContactUs;
import com.example.demo.entity.Credit_Card_Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactUsRepo extends JpaRepository<ContactUs,Integer> {
    ContactUs findContactUsByIdContact(Integer idContact);

}
