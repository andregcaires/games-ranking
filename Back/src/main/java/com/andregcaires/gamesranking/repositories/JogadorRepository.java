package com.andregcaires.gamesranking.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.andregcaires.gamesranking.entities.Jogador;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Integer> {

	@Query("select j from Jogador j order by j.qtdVitorias desc")
	public List<Jogador> findAllOrderByQtdVitoriasDesc();
}
