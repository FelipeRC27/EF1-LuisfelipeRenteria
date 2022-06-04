package com.idat.FelipeRenteriaRopa.Controller;

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


import com.idat.FelipeRenteriaRopa.Model.Ropa;
import com.idat.FelipeRenteriaRopa.Service.RopaService;



@Controller
@RequestMapping("/ropa/v1")
public class RopaController {
	
	@Autowired
	private RopaService service;
	
	@GetMapping(path = "/listar")
	public @ResponseBody List<Ropa> listar(){
		return service.listarRopa();
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Ropa ropaPorId(@PathVariable Integer id) {
		return service.rpaPorId(id);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarRopa(@PathVariable Integer id) {
		service.elimanarRopa(id);
	}
	
	@PostMapping("/")
	public void guardarRopa(@RequestBody Ropa ropa) {
		service.guardarRopa(ropa);
	}

}
