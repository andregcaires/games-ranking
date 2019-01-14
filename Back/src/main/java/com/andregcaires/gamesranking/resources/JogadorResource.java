package com.andregcaires.gamesranking.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.andregcaires.gamesranking.entities.Jogador;
import com.andregcaires.gamesranking.services.JogadorService;

@RestController
@RequestMapping(value = {"/jogador", "/jogador/", "", "/"})
public class JogadorResource {

	@Autowired
	private JogadorService _service;
	
	@CrossOrigin
	@RequestMapping(value={"", "/", "visualizarRanking"}, method = RequestMethod.GET)
	public ResponseEntity<?> findAll(){
		
		List<Jogador> obj = _service.findAll();
		return ResponseEntity.ok().body(obj);
	}
	
	@CrossOrigin
	@RequestMapping(value = {"/{id}", "/{id}/"}, method = RequestMethod.GET)
	public ResponseEntity<Jogador> findOne(@PathVariable Integer id) throws Throwable {
		
		Jogador obj = _service.find(id);		
		return ResponseEntity.ok().body(obj);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/adicionar", method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Jogador obj) {
		
		obj = _service.insert(obj);
		
		URI uri = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/adicionar/{id}")
				.buildAndExpand(obj.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	@CrossOrigin
	@RequestMapping(value = "/atualiza", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Jogador obj) {		
		obj = _service.update(obj);
		return ResponseEntity.noContent().build();		
	}
	
}
