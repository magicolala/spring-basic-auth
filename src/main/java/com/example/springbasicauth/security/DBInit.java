package com.example.springbasicauth.security;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.springbasicauth.entity.RoleUtilisateur;
import com.example.springbasicauth.entity.Utilisateur;
import com.example.springbasicauth.repository.UtilisateurRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DBInit implements CommandLineRunner{
	private final UtilisateurRepository utilisateurRepository;
	private final PasswordEncoder passwordEncoder;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//utilisateurRepository.save(new Utilisateur("Div", passwordEncoder.encode("123"), RoleUtilisateur.ADMIN));
		//utilisateurRepository.save(new Utilisateur("Cris", passwordEncoder.encode("1234"), RoleUtilisateur.USER));
	}

}
