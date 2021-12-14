package com.example.springbasicauth.security;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.springbasicauth.entity.Utilisateur;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DetailsUtilisateur implements UserDetails{
	
	private Utilisateur utilisateur;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("ROLE_" + utilisateur.getRole().toString());
		
		return Collections.singletonList(grantedAuthority);
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return utilisateur.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return utilisateur.getLogin();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
