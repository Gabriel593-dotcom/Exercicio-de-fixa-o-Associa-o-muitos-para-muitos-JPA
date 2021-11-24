package com.example.exercicio_fix_manytomany.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exercicio_fix_manytomany.entities.Produto;
import com.example.exercicio_fix_manytomany.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;

	public List<Produto> findAll(){
		return produtoRepository.findAll();
	}
}
