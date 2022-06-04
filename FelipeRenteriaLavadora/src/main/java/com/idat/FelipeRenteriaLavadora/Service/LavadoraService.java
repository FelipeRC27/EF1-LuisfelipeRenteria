package com.idat.FelipeRenteriaLavadora.Service;

import java.util.List;

import com.idat.FelipeRenteriaLavadora.Modelo.Lavadora;

public interface LavadoraService {

	public List<Lavadora> listarLavadora();
	public Lavadora lavadoraPorId(Integer l);
	public void elimanarLavadora(Integer l);
	public void guardarLavadora(Lavadora lavadora);
}
