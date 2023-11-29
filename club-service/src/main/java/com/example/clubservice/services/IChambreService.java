package com.example.clubservice.services;

import com.example.clubservice.entites.Bloc;
import com.example.clubservice.entites.Chambre;

import java.util.List;
import java.util.Set;

public interface IChambreService {
    public List<Chambre> AllChambres();
    public Chambre ChambreById(Long id);
    public Chambre addChambre(Chambre b);
    public void removeChambre(long id);
    public Chambre UpdateChambre(Chambre b);
    public Bloc getBlocByChambreId(long idChambre);
    public Set<Chambre> findbyblocname(String blocname);

}
