package com.example.exercicio_fix_manytomany.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.exercicio_fix_manytomany.entities.Lista;

public interface ListaRepository extends JpaRepository<Lista, Long>{

}
