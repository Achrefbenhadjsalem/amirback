package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Loan_Request {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCard;
    private String nssf;
    private String Annual_reciept;
    private String account_statement;
    private String quittance;
    private String RNE;
    private String Statue;
    private String The_balance_sheets;


}
