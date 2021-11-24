package com.example.exercicio_fix_manytomany.entities.enums;

public enum EstadoProduto {

	NOVO(1), SEMINOVO(2), AVARIADO(3), DEFEITUOSO(4);

	private int code;

	private EstadoProduto(Integer code) {
		this.code = code;
	}

	public Integer getCode() {
		return this.code;
	}

	public static EstadoProduto getEstado(Integer code) {
		for (EstadoProduto estado : EstadoProduto.values()) {
			if (estado.getCode() == code) {
				return estado;
			}
		}

		throw new IllegalArgumentException();
	}

}
