package com.example.demo.Controller;

import com.example.demo.Service.ContactUsServ;
import com.example.demo.Service.CreditCardServ;
import com.example.demo.entity.ContactUs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ContactUs")
@CrossOrigin("*")
public class ContactUsController {
    @Autowired
    private ContactUsServ contactUsServ ;
    @PostMapping("/AddContactUs")
    public ContactUs AddContactUs(@RequestBody ContactUs contactUs) {
        return contactUsServ.AddContactUs(contactUs);
    }
    @PutMapping("/editContactUsByID/{idContact}")
    public ContactUs editContactUsByID(@PathVariable("idContact") Integer idContact,@RequestBody ContactUs contactUs) {
        return contactUsServ.editContactUsByID(idContact, contactUs);
    }
    @DeleteMapping("/deleteContactUsById/{idContact}")
    public void deleteContactUsById(@PathVariable("idContact") Integer idContact) {
        contactUsServ.deleteContactUsById(idContact);
    }
    @GetMapping("/getAllContactUs")
    public List<ContactUs> getAllContactUs() {
        return contactUsServ.getAllContactUs();
    }
}
