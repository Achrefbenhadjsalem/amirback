package com.example.demo.repository;

import com.example.demo.entity.Checkbook;
import com.example.demo.entity.ContactUs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckbookRepo extends JpaRepository<Checkbook,Integer> {
    Checkbook findCheckbookByIdCheckbook(Integer idCheckbook);

}
