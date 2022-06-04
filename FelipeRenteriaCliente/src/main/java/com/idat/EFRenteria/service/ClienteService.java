package com.idat.EFRenteria.service;

import java.util.List;

import com.idat.EFRenteria.modelo.Cliente;

public interface ClienteService {
	
	public List<Cliente> listarCliente();
	public Cliente clientePorId(Integer c);
	public void elimanarCliente(Integer c);
	public void guardarCliente(Cliente cliente);

}
