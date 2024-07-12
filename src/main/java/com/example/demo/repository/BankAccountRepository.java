package com.example.demo.repository;

import com.example.demo.entity.BankAccount;
import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BankAccountRepository extends JpaRepository <BankAccount, Integer> {

    BankAccount findByRib(String rib);



}
