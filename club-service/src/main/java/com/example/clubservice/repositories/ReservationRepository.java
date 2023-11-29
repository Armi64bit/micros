package com.example.clubservice.repositories;

import com.example.clubservice.entites.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    @Query("SELECT r FROM Reservation r WHERE :idEtudiant IN (SELECT e.idEtudiqnt FROM r.etudiants e)")
    List<Reservation> findReservationsByEtudiantId(@Param("idEtudiant") long idEtudiant);


}
