package com.example.demo.repository;

import com.example.demo.entity.Credit_Card_Request;
import com.example.demo.entity.Loan_Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepo extends JpaRepository<Credit_Card_Request,Integer> {
    Credit_Card_Request findCredit_Card_RequestByIdCreditCard(Integer idCreditCard);


}
