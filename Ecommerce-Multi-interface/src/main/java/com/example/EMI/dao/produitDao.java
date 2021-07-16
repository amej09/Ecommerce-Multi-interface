package com.example.EMI.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EMI.bean.produit;

public interface produitDao extends JpaRepository<produit, Long> {
	public produit findByRef(String ref);

}
