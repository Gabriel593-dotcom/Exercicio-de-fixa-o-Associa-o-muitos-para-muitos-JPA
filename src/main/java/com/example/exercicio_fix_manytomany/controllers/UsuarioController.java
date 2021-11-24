package com.example.exercicio_fix_manytomany.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exercicio_fix_manytomany.entities.Usuario;
import com.example.exercicio_fix_manytomany.services.UsuarioService;

@RestController
@RequestMapping(value = "/api/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping
	public ResponseEntity<List<Usuario>> findAll() {
		List<Usuario> listaUsuarios = usuarioService.findAll();
		return ResponseEntity.ok().body(listaUsuarios);
	}
}
