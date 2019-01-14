package com.andregcaires.gamesranking;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.andregcaires.gamesranking.entities.Jogador;
import com.andregcaires.gamesranking.repositories.JogadorRepository;

@SpringBootApplication
public class GamesRankingApplication implements CommandLineRunner{
	
	@Autowired
	private JogadorRepository _jogadorRepository;

	public static void main(String[] args) {
		SpringApplication.run(GamesRankingApplication.class, args);
	}

	// método para instancias objetos iniciais no banco de dados h2
	@Override
	public void run(String... args) throws Exception {
		
		Jogador j1, j2, j3;		
		j1 = new Jogador(null, "Carlos", 0, 0);
		j2 = new Jogador(null, "Maria", 0, 0);
		j3 = new Jogador(null, "José", 0, 0);
		_jogadorRepository.saveAll(Arrays.asList(j1, j2, j3));
		
	}

}

