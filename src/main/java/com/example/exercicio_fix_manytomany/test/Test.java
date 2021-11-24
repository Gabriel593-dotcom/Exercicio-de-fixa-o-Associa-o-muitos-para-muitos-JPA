package com.example.exercicio_fix_manytomany.test;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.exercicio_fix_manytomany.entities.Lista;
import com.example.exercicio_fix_manytomany.entities.Produto;
import com.example.exercicio_fix_manytomany.entities.Usuario;
import com.example.exercicio_fix_manytomany.entities.enums.EstadoProduto;
import com.example.exercicio_fix_manytomany.repositories.ListaRepository;
import com.example.exercicio_fix_manytomany.repositories.ProdutoRepository;
import com.example.exercicio_fix_manytomany.repositories.UsuarioRespository;

@Configuration
public class Test implements CommandLineRunner {

	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
	private ListaRepository listaRepository;

	@Autowired
	private UsuarioRespository usuarioRepository;

	@Override
	public void run(String... args) throws Exception {

		Usuario user1 = new Usuario(null, "gabriel@teste.com", "123");
		Usuario user2 = new Usuario(null, "ana@teste.com", "123");
		Usuario user3 = new Usuario(null, "roger@teste.com", "123");

		Lista list1 = new Lista(null, "Computadores");
		Lista list2 = new Lista(null, "Eletrodomesticos");

		listaRepository.saveAll(Arrays.asList(list1, list2));

		Produto prod1 = new Produto(null, "Geladeira", 1000.0, 10, EstadoProduto.NOVO, list2);
		Produto prod2 = new Produto(null, "Computador", 1000.0, 10, EstadoProduto.DEFEITUOSO, list1);

		produtoRepository.saveAll(Arrays.asList(prod1, prod2));

		user1.getListas().add(list1);
		user2.getListas().add(list2);
		user3.getListas().add(list1);
		user3.getListas().add(list2);

		usuarioRepository.saveAll(Arrays.asList(user1, user2, user3));

	}

}
