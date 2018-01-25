package com.techAIK.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.techAIK.model.Produit;

@Component
public interface ProduitJpaRespository extends JpaRepository<Produit, Long>{
	
	@Query("select p from Produit p where p.designation like :x")
	Page<Produit> produitParMC(@Param("x") String mc, Pageable p);
	
	Page<Produit> findByDesignation(String des, Pageable p);
    List<Produit> findByDesignation(String name);

	List<Produit> findByReference(Long ref);
}
