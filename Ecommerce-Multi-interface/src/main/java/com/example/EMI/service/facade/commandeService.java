package com.example.EMI.service.facade;

import java.util.List;

import com.example.EMI.bean.commande;

public interface commandeService {
	
	public commande findById(Long id) ;
	public int save(commande obj);
	public int update(commande obj);
	public int delete(Long id);
	public List<commande> findAll();

}
