package com.example.clubservice.services;


import com.example.clubservice.entites.Universite;

import java.util.List;

public interface IUniversiteService {
    public List<Universite> AllUniversites();
    public Universite UniversiteById(Long id);
    public Universite addUniversite(Universite b);
    public void removeUniversite(long id);
    public Universite UpdateUniversite(Universite b);
}
