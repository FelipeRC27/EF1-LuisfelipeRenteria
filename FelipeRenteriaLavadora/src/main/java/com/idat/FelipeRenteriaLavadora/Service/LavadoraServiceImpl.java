package com.idat.FelipeRenteriaLavadora.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.FelipeRenteriaLavadora.Modelo.Lavadora;
import com.idat.FelipeRenteriaLavadora.Repository.LavadoraRepository;

@Service
public class LavadoraServiceImpl implements LavadoraService {

	@Autowired
	private LavadoraRepository repository;
	
	@Override
	public List<Lavadora> listarLavadora() {
		return repository.findAll();
	}

	@Override
	public Lavadora lavadoraPorId(Integer l) {
		return repository.findById(l).orElse(null);
	}

	@Override
	public void elimanarLavadora(Integer l) {
		repository.deleteById(l);
	}

	@Override
	public void guardarLavadora(Lavadora lavadora) {
		repository.save(lavadora);
	}

}
