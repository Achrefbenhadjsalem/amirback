package com.example.demo.Service;

import com.example.demo.entity.ContactUs;
import com.example.demo.entity.Credit_Card_Request;

import java.util.List;

public interface ContactUsServ {
    ContactUs AddContactUs(ContactUs contactUs);

    List<ContactUs> getAllContactUs();

    ContactUs editContactUsByID(Integer idContact,ContactUs contactUs);

    void deleteContactUsById(Integer idContact);
}
