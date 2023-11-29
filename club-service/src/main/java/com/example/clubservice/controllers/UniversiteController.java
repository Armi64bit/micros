package com.example.clubservice.controllers;

import com.example.clubservice.entites.Universite;
import com.example.clubservice.services.IUniversiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/universite")
public class UniversiteController {
    @Autowired
    IUniversiteService universiteService;

    @GetMapping("/all")
    public List<Universite> getUniversites(){
        List<Universite> listUniversites = universiteService.AllUniversites();
        return listUniversites;
    }

    @GetMapping("/retrieve/{universite-id}")
    public Universite retrieveUniversite(@PathVariable("universite-id") Long unId){
        Universite universite = universiteService.UniversiteById(unId);
        return universite;
    }
    @PostMapping("/add")
    public Universite addUniversite(@RequestBody Universite u ){
        Universite universite = universiteService.addUniversite(u);
        return universite;
    }
    @DeleteMapping("/remove/{universite-id}")
    public void removeUniversite(@PathVariable("universite-id")Long unId){
        universiteService.removeUniversite(unId);
    }

    @PutMapping("/modify-universite")
    public Universite modifyUniversite(@RequestBody Universite u){
        Universite universite = universiteService.UpdateUniversite(u);
        return universite;
    }
}
