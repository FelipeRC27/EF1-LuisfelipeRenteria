package com.idat.FelipeRenteriaRopa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.FelipeRenteriaRopa.Model.Ropa;
import com.idat.FelipeRenteriaRopa.Repository.RopaRepository;

@Service
public class RopaServiceImpl implements RopaService {

	@Autowired
	private RopaRepository repository;
	
	@Override
	public List<Ropa> listarRopa() {
		return repository.findAll();
	}

	@Override
	public Ropa rpaPorId(Integer r) {
		return repository.findById(r).orElse(null);
	}

	@Override
	public void elimanarRopa(Integer r) {
		repository.deleteById(r);
	}

	@Override
	public void guardarRopa(Ropa ropa) {
		repository.save(ropa);

	}

}
