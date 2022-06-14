package com.eventoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventoapp.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long>{
}
