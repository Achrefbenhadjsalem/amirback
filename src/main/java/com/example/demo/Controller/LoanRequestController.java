package com.example.demo.Controller;

import com.example.demo.Service.LoanRequestServ;
import com.example.demo.entity.Loan_Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/LoanRequest")
@CrossOrigin("*")
public class LoanRequestController {
    @Autowired
    private  LoanRequestServ loanRequestServ;
    @PostMapping("/AddLoanRequest")
    public Loan_Request AddLoanRequest(@RequestBody Loan_Request loanRequest) {
        return loanRequestServ.AddLoanRequest(loanRequest);
    }
    @DeleteMapping("/deleteLoanRequestById/{idCard}")
    public void deleteLoanRequestById(@PathVariable("idCard") Integer idCard) {
        loanRequestServ.deleteLoanRequestById(idCard);
    }
    @PutMapping("/editLoan_RequestByID/{idCard}")
    public Loan_Request editLoan_RequestByID(@PathVariable("idCard") Integer idCard,@RequestBody Loan_Request loanRequest) {
        return loanRequestServ.editLoan_RequestByID(idCard, loanRequest);
    }
    @GetMapping("/getAllLoanRequest")
    public List<Loan_Request> getAllLoanRequest() {
        return loanRequestServ.getAllLoanRequest();
    }
}
