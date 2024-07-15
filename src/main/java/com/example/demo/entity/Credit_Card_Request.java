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
public class Credit_Card_Request {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCreditCard;
    private String fullname;
    private String email;
    private String phoneNumber;
    private Integer annualRevenue;
    private String adress;
    private String statu;


}
