package com.example.demo.Service;

import com.example.demo.entity.Loan_Request;

import java.util.List;

public interface LoanRequestServ {
    Loan_Request AddLoanRequest(Loan_Request loanRequest);

    List<Loan_Request> getAllLoanRequest();

    Loan_Request editLoan_RequestByID(Integer idCard,Loan_Request loanRequest);

    void deleteLoanRequestById(Integer idCard);

}
