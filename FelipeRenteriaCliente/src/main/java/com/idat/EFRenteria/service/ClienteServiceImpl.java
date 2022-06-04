package com.idat.EFRenteria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EFRenteria.modelo.Cliente;
import com.idat.EFRenteria.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	@Override
	public List<Cliente> listarCliente() {
		return repository.findAll();
	}

	@Override
	public Cliente clientePorId(Integer c) {
		return repository.findById(c).orElse(null);
	}

	@Override
	public void elimanarCliente(Integer c) {
		repository.deleteById(c);
	}

	@Override
	public void guardarCliente(Cliente cliente) {
		repository.save(cliente);
	}

}
