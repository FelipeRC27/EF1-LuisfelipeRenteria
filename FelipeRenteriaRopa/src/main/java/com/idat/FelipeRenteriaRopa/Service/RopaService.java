package com.idat.FelipeRenteriaRopa.Service;

import java.util.List;

import com.idat.FelipeRenteriaRopa.Model.Ropa;

public interface RopaService {

	public List<Ropa> listarRopa();
	public Ropa rpaPorId(Integer r);
	public void elimanarRopa(Integer r);
	public void guardarRopa(Ropa ropa);
}
