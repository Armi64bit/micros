package com.example.clubservice.services;

import com.example.clubservice.entites.Etudiant;
import com.example.clubservice.repositories.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService{
    @Autowired
    EtudiantRepository etudiantRep;
    @Override
    public List<Etudiant> AllEtudiants() {
        return etudiantRep.findAll();
    }

    @Override
    public Etudiant EtudiantById(Long id) {
        return etudiantRep.findById(id).get();
    }
    @Override
    public Etudiant addEtudiant(Etudiant b) {
        return etudiantRep.save(b);
    }

    @Override
    public void removeEtudiant(long id) {
        etudiantRep.deleteById(id);
    }

    @Override
    public Etudiant UpdateEtudiant(Etudiant b) {
        return etudiantRep.save(b);
    }
}
