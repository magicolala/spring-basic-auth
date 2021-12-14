package com.example.springbasicauth.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.springbasicauth.entity.Utilisateur;
import com.example.springbasicauth.repository.UtilisateurRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DetailsUtilisateurService implements UserDetailsService{
	private final UtilisateurRepository utilisateurRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) {
		// TODO Auto-generated method stub
		Utilisateur utilisateur = utilisateurRepository.findByLogin(username);
		if (utilisateur != null) {
			return new DetailsUtilisateur(utilisateur);
			
		}
		
		throw new UsernameNotFoundException(username + " pas dans la BDD");
	}

}
