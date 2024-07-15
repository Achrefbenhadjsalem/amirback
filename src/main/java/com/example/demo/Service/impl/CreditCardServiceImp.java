package com.example.demo.Service.impl;

import com.example.demo.Service.CreditCardServ;
import com.example.demo.entity.Credit_Card_Request;
import com.example.demo.entity.Loan_Request;
import com.example.demo.repository.CreditCardRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CreditCardServiceImp implements CreditCardServ {
    @Autowired
    CreditCardRepo creditCardRepo;

    @Override
    public Credit_Card_Request AddCredit_Card_Request(Credit_Card_Request creditCardRequest) {
        return creditCardRepo.save(creditCardRequest);
    }

    @Override
    public List<Credit_Card_Request> getAllCredit_Card_Request() {
        return creditCardRepo.findAll();
    }

    @Override
    public Credit_Card_Request editCredit_Card_RequestByID(Integer IdCreditCard, Credit_Card_Request creditCardRequest) {
        Credit_Card_Request creditCardRequest1 = creditCardRepo.findCredit_Card_RequestByIdCreditCard(IdCreditCard);
        if (creditCardRequest1 != null) {
            creditCardRequest1.setFullname(creditCardRequest.getFullname());
            creditCardRequest1.setAdress(creditCardRequest.getAdress());
            creditCardRequest1.setEmail(creditCardRequest.getEmail());
            creditCardRequest1.setPhoneNumber(creditCardRequest.getPhoneNumber());
            creditCardRequest1.setAnnualRevenue(creditCardRequest.getAnnualRevenue());
            creditCardRequest1.setStatu(creditCardRequest.getStatu());

            return creditCardRepo.save(creditCardRequest1);
        } else {
            System.out.println("does not exist");
            return null;
        }
    }

    @Override
    public void deleteCredit_Card_RequestById(Integer IdCreditCard) {
        creditCardRepo.deleteById(IdCreditCard);

    }
}
