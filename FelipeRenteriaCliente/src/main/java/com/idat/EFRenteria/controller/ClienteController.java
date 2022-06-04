package com.idat.EFRenteria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.EFRenteria.modelo.Cliente;
import com.idat.EFRenteria.service.ClienteService;

@Controller
@RequestMapping("/cliente/v1")
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping(path = "/listar")
	public @ResponseBody List<Cliente> listar(){
		return service.listarCliente();
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Cliente clientePorId(@PathVariable Integer id) {
		return service.clientePorId(id);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarCliente(@PathVariable Integer id) {
		service.elimanarCliente(id);
	}
	
	@PostMapping("/")
	public void guardarCliente(@RequestBody Cliente cliente) {
		service.guardarCliente(cliente);
	}

}
