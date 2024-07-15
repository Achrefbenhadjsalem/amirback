package com.example.demo.Controller;

import com.example.demo.Service.CreditCardServ;
import com.example.demo.Service.LoanRequestServ;
import com.example.demo.entity.Credit_Card_Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CreditCard")
@CrossOrigin("*")
public class CreditCardController {
    @Autowired
    private CreditCardServ creditCardServ ;
    @PostMapping("/AddCredit_Card_Request")
    public Credit_Card_Request AddCredit_Card_Request(@RequestBody Credit_Card_Request creditCardRequest) {
        return creditCardServ.AddCredit_Card_Request(creditCardRequest);
    }


    @GetMapping("/getAllCredit_Card_Request")
    public List<Credit_Card_Request> getAllCredit_Card_Request() {
        return creditCardServ.getAllCredit_Card_Request();
    }
    @DeleteMapping("/deleteCredit_Card_RequestById/{IdCreditCard}")
    public void deleteCredit_Card_RequestById(@PathVariable("IdCreditCard") Integer IdCreditCard) {
        creditCardServ.deleteCredit_Card_RequestById(IdCreditCard);
    }
    @PutMapping("/editCredit_Card_RequestByID/{IdCreditCard}")
    public Credit_Card_Request editCredit_Card_RequestByID(@PathVariable("IdCreditCard") Integer IdCreditCard,@RequestBody Credit_Card_Request creditCardRequest) {
        return creditCardServ.editCredit_Card_RequestByID(IdCreditCard, creditCardRequest);
    }
}
