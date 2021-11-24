package com.example.exercicio_fix_manytomany.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.exercicio_fix_manytomany.entities.Usuario;

public interface UsuarioRespository extends JpaRepository<Usuario, Long> {

}
