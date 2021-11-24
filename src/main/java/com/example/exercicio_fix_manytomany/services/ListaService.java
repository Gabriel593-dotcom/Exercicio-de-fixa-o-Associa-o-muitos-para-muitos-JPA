package com.example.exercicio_fix_manytomany.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exercicio_fix_manytomany.entities.Lista;
import com.example.exercicio_fix_manytomany.repositories.ListaRepository;

@Service
public class ListaService {

	@Autowired
	private ListaRepository listaRepository;
	
	public List<Lista> findAll(){
		return listaRepository.findAll();
	}
}
