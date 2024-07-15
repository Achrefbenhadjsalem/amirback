package com.example.demo.Service;

import com.example.demo.entity.Checkbook;
import com.example.demo.entity.ContactUs;

import java.util.List;

public interface CheckbookServ {
    Checkbook AddCheckbook(Checkbook checkbook);

    List<Checkbook> getAllCheckbook();

    Checkbook editCheckbookByID(Integer idCheckbook,Checkbook checkbook);

    void deleteCheckbookById(Integer idCheckbook);
}
