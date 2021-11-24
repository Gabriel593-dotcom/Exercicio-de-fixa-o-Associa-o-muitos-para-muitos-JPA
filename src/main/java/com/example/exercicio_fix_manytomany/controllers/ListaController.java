package com.example.exercicio_fix_manytomany.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exercicio_fix_manytomany.entities.Lista;
import com.example.exercicio_fix_manytomany.services.ListaService;

@RestController 
@RequestMapping(value="/api/listas")
public class ListaController {

	@Autowired
	private ListaService listaService;
	
	@GetMapping
	public ResponseEntity<List<Lista>> findAll(){
		List<Lista> listas = listaService.findAll();
		return ResponseEntity.ok().body(listas);
	}
}
