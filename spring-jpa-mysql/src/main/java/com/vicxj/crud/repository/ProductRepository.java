package com.vicxj.crud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vicxj.crud.entiry.Products;

public interface ProductRepository extends JpaRepository<Products, Integer> {

	/* Optional<Products> findByProduct_name(String pname); */

}
