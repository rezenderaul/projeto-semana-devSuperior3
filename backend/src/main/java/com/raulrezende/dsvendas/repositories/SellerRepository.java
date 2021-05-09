package com.raulrezende.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raulrezende.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
