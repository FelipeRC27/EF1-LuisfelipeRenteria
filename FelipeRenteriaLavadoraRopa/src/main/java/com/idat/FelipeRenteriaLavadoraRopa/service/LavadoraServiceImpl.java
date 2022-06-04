package com.idat.FelipeRenteriaLavadoraRopa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.FelipeRenteriaLavadoraRopa.Modelo.Lavadora;
import com.idat.FelipeRenteriaLavadoraRopa.client.OpenFeignClient;

@Service
public class LavadoraServiceImpl implements LavadoraService {

	@Autowired
	private OpenFeignClient cliente;
	
	@Override
	public List<Lavadora> asignarRopaporLavadora() {
		
		List<Lavadora> listarLavadora = new ArrayList<>();
		Lavadora lavadora = new Lavadora();
		
		lavadora.setIdLavadora(1);
		lavadora.setDescripcion("Descripcion");
		lavadora.setMarca("Marca");
		lavadora.setVoltaje("Voltaje");
		lavadora.setListarRopa(cliente.listarRopa());
		
		listarLavadora.add(lavadora);
		return listarLavadora;
				
	}

}
