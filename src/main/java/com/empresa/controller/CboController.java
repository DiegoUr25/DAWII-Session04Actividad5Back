package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Ciclo;
import com.empresa.entity.Usuario;
import com.empresa.service.CicloService;
import com.empresa.service.UsuarioService;

@RestController
@RequestMapping("/rest/cbo")
@CrossOrigin(origins = "http://localhost:4200")
public class CboController {
	
	@Autowired
	private CicloService cicloservice;
	
	@GetMapping("/ciclo")
	@ResponseBody
	public ResponseEntity<List<Ciclo>> listaCiclo(){
		List<Ciclo> listaciclo = cicloservice.listaCiclo();
		return ResponseEntity.ok(listaciclo);
	}
	
	@Autowired
	private UsuarioService usuarioservice;
	
	
	@GetMapping("/usuario")
	@ResponseBody
	public ResponseEntity<List<Usuario>> listaUsuario(){
	List<Usuario> listausuario = usuarioservice.listaUsuario();
	return ResponseEntity.ok(listausuario);
	}

}
