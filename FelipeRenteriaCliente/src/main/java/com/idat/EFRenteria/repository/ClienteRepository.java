package com.idat.EFRenteria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFRenteria.modelo.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
