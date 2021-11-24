package com.example.exercicio_fix_manytomany.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exercicio_fix_manytomany.entities.Produto;
import com.example.exercicio_fix_manytomany.services.ProdutoService;

@RestController
@RequestMapping(value = "/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@GetMapping
	public ResponseEntity<List<Produto>> findAll() {
		List<Produto> listaProduto = produtoService.findAll();
		return ResponseEntity.ok().body(listaProduto);
	}
}
