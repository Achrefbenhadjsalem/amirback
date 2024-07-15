package com.example.demo.Service.impl;

import com.example.demo.Service.CheckbookServ;
import com.example.demo.entity.Checkbook;
import com.example.demo.entity.ContactUs;
import com.example.demo.repository.CheckbookRepo;
import com.example.demo.repository.ContactUsRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Service
@Slf4j
public class CheckBookServiceImp implements CheckbookServ {
    @Autowired
    private CheckbookRepo checkbookRepo;


    @Override
    public Checkbook AddCheckbook(Checkbook checkbook) {
        return checkbookRepo.save(checkbook);
    }

    @Override
    public List<Checkbook> getAllCheckbook() {
        return checkbookRepo.findAll();
    }

    @Override
    public Checkbook editCheckbookByID(Integer idCheckbook, Checkbook checkbook) {
        Checkbook checkbook1 = checkbookRepo.findCheckbookByIdCheckbook(idCheckbook);
        if (checkbook1 != null) {
            checkbook1.setQuantityCheck(checkbook.getQuantityCheck());
            return checkbookRepo.save(checkbook1);
        } else {
            System.out.println("does not exist");
            return null;
        }
    }

    @Override
    public void deleteCheckbookById(Integer idCheckbook) {
        checkbookRepo.deleteById(idCheckbook);

    }
}
