package com.example.introducao.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.introducao.entities.Tecnico;

@RestController
@RequestMapping(value = "/tecnicos")
public class TecnicoResource {
	@GetMapping
	public ResponseEntity<List<Tecnico>> findAll(){
		List<Tecnico> list = new ArrayList<>();
		list.add(new Tecnico(1L, "João Silva", "(67) 9999-9990", "joão@gmail.com", "123"));
		list.add(new Tecnico(1L, "Maria Celeste", "(67) 9999-9999", "maria@gmail.com", "123"));
		return ResponseEntity.ok().body(list);
		
		 
		
		
		
	}
}