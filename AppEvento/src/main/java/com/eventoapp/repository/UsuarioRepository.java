package com.eventoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventoapp.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	Usuario findByLogin(String login);
}
