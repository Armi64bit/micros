package com.example.clubservice.services;

import com.example.clubservice.entites.Bloc;
import com.example.clubservice.entites.Chambre;
import com.example.clubservice.repositories.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class ChambreService implements IChambreService {
    @Autowired
    ChambreRepository chambreRep;
    @Override
    public List<Chambre> AllChambres() {
        return chambreRep.findAll();
    }
    @Override
    public Chambre ChambreById(Long id) {
        return chambreRep.findById(id).get();
    }
    @Override
    public Chambre addChambre(Chambre b) {
        return chambreRep.save(b);
    }

    @Override
    public void removeChambre(long id) {
        chambreRep.deleteById(id);
    }

    @Override
    public Chambre UpdateChambre(Chambre b) {
        return chambreRep.save(b);
    }
    @Override
    public Bloc getBlocByChambreId(long idChambre) {
        return chambreRep.findBlocByChambreId(idChambre);
    }

    @Override
    public Set<Chambre> findbyblocname(String blocname) {
        return chambreRep.findChambreByBloc_NomBlocContains(blocname);
    }
}
