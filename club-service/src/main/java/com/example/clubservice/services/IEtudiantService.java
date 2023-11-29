package com.example.clubservice.services;


import com.example.clubservice.entites.Etudiant;

import java.util.List;

public interface IEtudiantService {
    public List<Etudiant> AllEtudiants();
    public Etudiant EtudiantById(Long id);
    public Etudiant addEtudiant(Etudiant b);
    public void removeEtudiant(long id);
    public Etudiant UpdateEtudiant(Etudiant b);

}
