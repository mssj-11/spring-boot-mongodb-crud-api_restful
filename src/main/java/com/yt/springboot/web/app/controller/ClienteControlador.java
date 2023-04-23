package com.yt.springboot.web.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yt.springboot.web.app.model.Cliente;
import com.yt.springboot.web.app.repository.ClienteRepositorio;


@RestController
@RequestMapping("/clientes")
public class ClienteControlador {
	
	
	@Autowired
	private ClienteRepositorio clienteRepositorio;
	
	
	
	@PostMapping
	public ResponseEntity<?> guardarCliente(@RequestBody Cliente cliente){
		try {
			Cliente client = clienteRepositorio.save(cliente);
			return new ResponseEntity<Cliente>(client, HttpStatus.CREATED);
		}catch(Exception e) {
			return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
	@GetMapping
	public ResponseEntity<?> mostarClientes(){
		try {
			List<Cliente> client = clienteRepositorio.findAll();
			return new ResponseEntity<List<Cliente>>(client, HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
	@PutMapping
	public ResponseEntity<?> actualizarCliente(@RequestBody Cliente cliente){
		try {
			Cliente client = clienteRepositorio.save(cliente);
			return new ResponseEntity<Cliente>(client, HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminarCliente(@PathVariable("id") Integer id){
		try {
			clienteRepositorio.deleteById(id);
			return new ResponseEntity<String>("Cliente Eliminado :)", HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
}
