package com.idat.FelipeRenteriaRopa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.FelipeRenteriaRopa.Model.Ropa;

@Repository
public interface RopaRepository extends JpaRepository<Ropa, Integer>{

}
