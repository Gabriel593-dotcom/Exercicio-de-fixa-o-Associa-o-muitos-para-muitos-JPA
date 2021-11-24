package com.example.exercicio_fix_manytomany.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exercicio_fix_manytomany.entities.Usuario;
import com.example.exercicio_fix_manytomany.repositories.UsuarioRespository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRespository usuarioRepository;

	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

}
