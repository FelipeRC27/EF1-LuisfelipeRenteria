package com.idat.FelipeRenteriaLavadora.Controller;

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


import com.idat.FelipeRenteriaLavadora.Modelo.Lavadora;
import com.idat.FelipeRenteriaLavadora.Service.LavadoraService;



@Controller
@RequestMapping("/lavadora/v1")
public class LavadoraCotroller {

	@Autowired
	private LavadoraService service;
	
	@GetMapping(path = "/listar")
	public @ResponseBody List<Lavadora> listar(){
		return service.listarLavadora();
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Lavadora lavadoraPorId(@PathVariable Integer id) {
		return service.lavadoraPorId(id);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarLavadora(@PathVariable Integer id) {
		service.elimanarLavadora(id);
	}
	
	@PostMapping("/")
	public void guardarLavadora(@RequestBody Lavadora lavadora) {
		service.guardarLavadora(lavadora);
	}
	
}
