package com.example.springbasicauth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, unique = true)
	private String login;
	private String password;
	@Enumerated(EnumType.STRING)
	private RoleUtilisateur role;
	
	public Utilisateur(String login, String password, RoleUtilisateur role) {
		this.login = login;
		this.password = password;
		this.role = role;
	}
	
	
	
}
