package com.example.demo.Service.impl;

import com.example.demo.Service.LoanRequestServ;
import com.example.demo.entity.Loan_Request;
import com.example.demo.repository.LoanRequestRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class LoanRequestServiceImp implements LoanRequestServ {
    @Autowired
    LoanRequestRepo loanRequestRepo;
    @Override
    public Loan_Request AddLoanRequest(Loan_Request loanRequest) {
        return loanRequestRepo.save(loanRequest);
    }

    @Override
    public List<Loan_Request> getAllLoanRequest() {
        return loanRequestRepo.findAll();
    }

    @Override
    public Loan_Request editLoan_RequestByID(Integer idCard, Loan_Request loanRequest) {
        Loan_Request loanRequest1 = loanRequestRepo.findLoan_RequestByIdCard(idCard);
        if (loanRequest1 != null) {
            loanRequest1.setIdCard(loanRequest.getIdCard());
            loanRequest1.setNssf(loanRequest.getNssf());
            loanRequest1.setAccount_statement(loanRequest.getAccount_statement());
            loanRequest1.setAnnual_reciept(loanRequest.getAnnual_reciept());
            return loanRequestRepo.save(loanRequest1);
        } else {
             System.out.println("does not exist");
             return null;
        }}

    @Override
    public void deleteLoanRequestById(Integer idCard) {
        Loan_Request loanRequest=loanRequestRepo.findLoan_RequestByIdCard(idCard);
        loanRequestRepo.deleteById(idCard);

    }

}
