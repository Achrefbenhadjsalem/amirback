package com.example.demo.Service.impl;

import com.example.demo.Service.ContactUsServ;
import com.example.demo.entity.ContactUs;
import com.example.demo.entity.Credit_Card_Request;
import com.example.demo.repository.ContactUsRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ContactUsServiceImp implements ContactUsServ {
    @Autowired
    private ContactUsRepo contactUsRepo;
    @Override
    public ContactUs AddContactUs(ContactUs contactUs) {
        return contactUsRepo.save(contactUs);
    }

    @Override
    public List<ContactUs> getAllContactUs() {
        return contactUsRepo.findAll();
    }

    @Override
    public ContactUs editContactUsByID(Integer idContact, ContactUs contactUs) {
        ContactUs contactUs1 = contactUsRepo.findContactUsByIdContact(idContact);
        if (contactUs1 != null) {
            contactUs1.setEmail(contactUs.getEmail());
            contactUs1.setSubject(contactUs.getSubject());
            contactUs1.setMessage(contactUs.getMessage());
            contactUs1.setFullname(contactUs.getFullname());
            return contactUsRepo.save(contactUs1);
        } else {
            System.out.println("does not exist");
            return null;
        }
    }

    @Override
    public void deleteContactUsById(Integer idContact) {
        contactUsRepo.deleteById(idContact);

    }
}
