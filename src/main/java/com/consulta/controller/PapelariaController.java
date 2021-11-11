package com.consulta.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.consulta.beans.Papelaria;
import com.consulta.dao.PapelariaDAO;

@RestController
public class PapelariaController {

	@Autowired
	private PapelariaDAO dao;
	
	@GetMapping("/papelaria")
	public ResponseEntity<List<Papelaria>> GetAll() {
		List<Papelaria> list = (List<Papelaria>)dao.findAll();
		return ResponseEntity.ok(list);
	
	}
	@GetMapping("/papelaria/{id}") //função para consultar pelo ID
	public ResponseEntity<Optional<Papelaria>> getById(@PathVariable("id") int id) {
		Optional<Papelaria> idList = dao.findById(id);
		return ResponseEntity.ok(idList);
	}
	@PostMapping("/novomaterial") //função para adicionar um material
	public ResponseEntity<Papelaria> addMaterial(@RequestBody Papelaria material) {
		try {
			dao.save(material);
			return ResponseEntity.ok(material);
		} catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}
}
