package com.example.exercicio_fix_manytomany.entities;

import static com.example.exercicio_fix_manytomany.entities.enums.EstadoProduto.getEstado;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.exercicio_fix_manytomany.entities.enums.EstadoProduto;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_produto")
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private String nome;
	private Double preco;
	private Integer quantidade;
	private Integer estadoProduto;

	@ManyToOne
	@JoinColumn(name = "lista_id")
	private Lista lista;

	public Produto() {
	}

	public Produto(Long codigo, String nome, Double preco, Integer quantidade, EstadoProduto estadoProduto,
			Lista lista) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		setEstadoProduto(estadoProduto);
		this.lista = lista;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	// import estatico. Sem necessidade de incluir a classe na chamada do método.
	public EstadoProduto getEstadoProduto() {
		return getEstado(estadoProduto);
	}

	public void setEstadoProduto(EstadoProduto estadoProduto) {
		this.estadoProduto = estadoProduto.getCode();
	}

	public Lista getLista() {
		return lista;
	}

	public void setLista(Lista lista) {
		this.lista = lista;
	}

	@Override
	public int hashCode() {
		return Objects.hash(estadoProduto, lista, nome, preco, quantidade);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(estadoProduto, other.estadoProduto) && Objects.equals(lista, other.lista)
				&& Objects.equals(nome, other.nome) && Objects.equals(preco, other.preco)
				&& Objects.equals(quantidade, other.quantidade);
	}

}
