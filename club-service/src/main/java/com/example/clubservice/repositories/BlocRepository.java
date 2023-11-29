package com.example.clubservice.repositories;

import com.example.clubservice.entites.Bloc;
import com.example.clubservice.entites.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BlocRepository extends JpaRepository <Bloc, Long> {
    @Query("SELECT c FROM Chambre c WHERE c.bloc.idBloc = :blocId")
    List<Chambre> findChambresByBlocId(@Param("blocId") Long blocId);
}
