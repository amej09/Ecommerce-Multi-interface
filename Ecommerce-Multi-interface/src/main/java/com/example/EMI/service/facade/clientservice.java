package com.example.EMI.service.facade;

import java.util.List;

import com.example.EMI.bean.client;



public interface clientservice {

	public client findById(Long id) ;
	public int save(client obj);
	public int update(client obj);
	public int delete(Long id);
	public List<client> findAll();
	

}
