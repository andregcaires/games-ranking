package com.andregcaires.gamesranking.services;

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
	
	private Jogador j1;
	
	@Before
	public void init() {
		j1 = new Jogador(1, "Carlos", 0, 0);
	}
	
	@Test
	public void verificaPesquisaJogador() {
		
		Optional<Jogador> opt = _repo.findById(1);
		Jogador jogadorTest = opt.orElse(null);
		
		Assert.assertEquals(j1, jogadorTest);
	}
}
