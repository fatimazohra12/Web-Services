package com.example.JAX_RS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JAX_RS.entities.Compte;

@Repository
public interface CompteRepository extends JpaRepository<Compte,Long> {

}
