package com.eventoapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.eventoapp.models.Usuario;
import com.eventoapp.repository.UsuarioRepository;

@Service(value = "userDetailsService")
public class UserDetailsServiveImpl implements UserDetailsService {
	
	@Autowired
	private final UsuarioRepository usuarioRepository;

	public UserDetailsServiveImpl(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario usuario = usuarioRepository.findByLogin(username); 
		
		if(usuario == null) {
			throw new UsernameNotFoundException("Usuário não encontrado");
		}
		
		return usuario;
		
	}

}
