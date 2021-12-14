package com.example.springbasicauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbasicauth.entity.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{

	Utilisateur findByLogin(String username);

}
