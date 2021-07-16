package com.example.EMI.service.facade;

import java.util.List;

import com.example.EMI.bean.produit;

public interface produitService {
	
	public produit findById(Long id) ;
	public int save(produit obj);
	public int update(produit obj);
	public int delete(Long id);
	public List<produit> findAll();

}
