package com.andregcaires.gamesranking.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andregcaires.gamesranking.entities.Jogador;
import com.andregcaires.gamesranking.repositories.JogadorRepository;
import com.andregcaires.gamesranking.services.exceptions.ObjetoNaoEncontradoException;

@Service
public class JogadorService {

	@Autowired
	private JogadorRepository _repo;
	
	public List<Jogador> findAll(){
		return _repo.findAllOrderByQtdVitoriasDesc();
	}
	
	public Jogador find(Integer id) throws Throwable {
		Optional<Jogador> obj = _repo.findById(id);		
		return obj.orElseThrow(() -> {
			throw new ObjetoNaoEncontradoException("Objeto não encontrado! ID: "+id
				+" Tipo: "+ Jogador.class);
			});
	}
	
	public Jogador insert (Jogador obj) {
		obj.setId(null);
		return _repo.save(obj);
	}
	
	public Jogador update(Jogador obj) throws ObjetoNaoEncontradoException {
		_repo.findById(obj.getId());
		return _repo.save(obj);	
	}
	
}
