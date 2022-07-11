package com.residencia.t2m.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.residencia.t2m.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	Optional<Usuario> findByEmail(String email);
}
