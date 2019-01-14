package com.andregcaires.gamesranking.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jogador implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;

	private int qtdVitorias;
	
	private int qtdPartidas;
	

	public Jogador(Integer id, String nome, int qtdVitorias, int qtdPartidas) {
		super();
		this.id = id;
		this.nome = nome;
		this.qtdVitorias = qtdVitorias;
		this.qtdPartidas = qtdPartidas;
	}

	public Jogador () {
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdVitorias() {
		return qtdVitorias;
	}

	public void setQtdVitorias(int qtdVitorias) {
		this.qtdVitorias = qtdVitorias;
	}

	public int getQtdPartidas() {
		return qtdPartidas;
	}

	public void setQtdPartidas(int qtdPartidas) {
		this.qtdPartidas = qtdPartidas;
	}

	@Override
	public String toString() {
		return "Jogador [id=" + id + ", nome=" + nome + ", qtdVitorias=" + qtdVitorias + ", qtdPartidas=" + qtdPartidas
				+ "]";
	}
	
	
	
}
