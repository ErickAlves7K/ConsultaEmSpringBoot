package com.consulta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
}
