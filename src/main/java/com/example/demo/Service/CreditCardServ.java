package com.example.demo.Service;

import com.example.demo.entity.Credit_Card_Request;
import com.example.demo.entity.Loan_Request;

import java.util.List;

public interface CreditCardServ {

    Credit_Card_Request AddCredit_Card_Request(Credit_Card_Request creditCardRequest);

    List<Credit_Card_Request> getAllCredit_Card_Request();

    Credit_Card_Request editCredit_Card_RequestByID(Integer IdCreditCard,Credit_Card_Request creditCardRequest);

    void deleteCredit_Card_RequestById(Integer IdCreditCard);

}
