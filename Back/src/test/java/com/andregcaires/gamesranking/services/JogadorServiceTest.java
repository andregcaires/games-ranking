package com.andregcaires.gamesranking.services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.andregcaires.gamesranking.entities.Jogador;
import com.andregcaires.gamesranking.repositories.JogadorRepository;

import cucumber.api.java.Before;

@RunWith(MockitoJUnitRunner.class)
public class JogadorServiceTest {

	@Mock
	private JogadorRepository _repo;
	
	private Jogador j1, j2, j3;
	private List<Jogador> listJogadores;
	
	@Before
	public void init() {
		j1 = new Jogador(1, "Carlos", 0, 0);
		j2 = new Jogador(null, "Maria", 0, 0);
		j3 = new Jogador(null, "José", 0, 0);
		listJogadores.addAll(Arrays.asList(j1, j2, j3));
	}
	
	@Test
	public void verificaPesquisaJogador() {
		
		Optional<Jogador> opt = _repo.findById(1);
		Jogador jogadorTest = opt.orElse(null);
		
		Assert.assertEquals(j1, jogadorTest);
	}
	
	// realizar no perfil dev - banco de dados MySql
	@Test
	public void verificaPesquisaTodosJogadores() {
		
		List<Jogador> listaBanco = _repo.findAll();
		
		Assert.assertEquals(listJogadores, listaBanco);
	}
}
