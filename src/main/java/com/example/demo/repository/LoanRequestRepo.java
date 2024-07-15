package com.example.demo.repository;

import com.example.demo.entity.Loan_Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LoanRequestRepo extends JpaRepository<Loan_Request,Integer> {
    Loan_Request findLoan_RequestByIdCard(Integer idCard);

}
