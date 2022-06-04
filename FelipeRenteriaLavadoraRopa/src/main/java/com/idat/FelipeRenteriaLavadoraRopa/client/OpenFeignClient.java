package com.idat.FelipeRenteriaLavadoraRopa.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.FelipeRenteriaLavadoraRopa.Modelo.Ropa;

@FeignClient(name = "FelipeRenteria-Ropa", url = "localhost:8080")
public interface OpenFeignClient {

	@GetMapping("/ropa/v1/listar")
	public List<Ropa> listarRopa();
}
