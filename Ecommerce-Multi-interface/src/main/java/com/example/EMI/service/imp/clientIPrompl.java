package com.example.EMI.service.imp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.EMI.bean.client;
import com.example.EMI.dao.clientDao;
import com.example.EMI.service.facade.clientservice;

@Service("clientIPrompl")
public class clientIPrompl implements clientservice{
	@Autowired
	private clientDao cd;
	


	@Override
	public client findById(Long id) {
		
		if(this.cd.findById(id).isPresent()){
			return this.cd.findById(id).get();
		}else {
			return null;
		}
	}

	@Override
	public int save(client obj) {
		if(this.findById(obj.getId()) != null ) {
			return -1;
		}else {
			obj.setType("ClientPro");
			this.cd.save(obj);
			return 0;
		}
		
	}

	@Override
	public int update(client obj) {
		if(this.findById(obj.getId()) == null ) {
			return -1;
			}else {
				cd.save(obj);
				return 0;
			}
	}

	@Override
	public int delete(Long id) {
		client clt = this.findById(id);
		if(clt == null) {
			return -1;
			}else {
				cd.delete(clt);
				return 0;
			}
	}



	@Override
	public List<client> findAll() {
		// TODO Auto-generated method stub
		return cd.findAll();
	}
	
	
	

	

}
