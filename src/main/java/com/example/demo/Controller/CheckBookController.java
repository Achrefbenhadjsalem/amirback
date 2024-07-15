package com.example.demo.Controller;

import com.example.demo.Service.CheckbookServ;
import com.example.demo.Service.ContactUsServ;
import com.example.demo.entity.Checkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Checkbook")
@CrossOrigin("*")
public class CheckBookController {
    @Autowired
    private CheckbookServ checkbookServ ;
    @GetMapping("/getAllCheckbook")
    public List<Checkbook> getAllCheckbook() {
        return checkbookServ.getAllCheckbook();
    }
    @PostMapping("/AddCheckbook")
    public Checkbook AddCheckbook(@RequestBody Checkbook checkbook) {
        return checkbookServ.AddCheckbook(checkbook);
    }
    @PutMapping("/editCheckbookByID/{idCheckbook}")
    public Checkbook editCheckbookByID(@PathVariable("idCheckbook") Integer idCheckbook,@RequestBody Checkbook checkbook) {
        return checkbookServ.editCheckbookByID(idCheckbook, checkbook);
    }
    @DeleteMapping("/deleteCheckbookById/{idCheckbook}")
    public void deleteCheckbookById(@PathVariable("idCheckbook") Integer idCheckbook) {
        checkbookServ.deleteCheckbookById(idCheckbook);
    }
}
