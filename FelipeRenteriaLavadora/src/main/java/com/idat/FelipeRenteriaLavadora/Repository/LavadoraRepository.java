package com.idat.FelipeRenteriaLavadora.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.FelipeRenteriaLavadora.Modelo.Lavadora;

@Repository
public interface LavadoraRepository extends JpaRepository<Lavadora, Integer>{

}
