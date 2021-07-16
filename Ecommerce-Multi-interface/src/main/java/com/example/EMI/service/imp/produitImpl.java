package com.example.EMI.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EMI.bean.produit;
import com.example.EMI.dao.produitDao;
import com.example.EMI.service.facade.produitService;
@Service
public class produitImpl implements produitService{
	
	@Autowired
	private produitDao pd;
	@Override
	public produit findById(Long id) {
		
		if(pd.findById(id).isPresent()){
			return pd.findById(id).get();
		}else {
			return null;
		}
	}

	@Override
	public int save(produit obj) {
		if(this.findById(obj.getId()) != null ) {
			
		return -1;
		}else {
			pd.save(obj);
			return 0;
		}
		
	}

	@Override
	public int update(produit obj) {
		if(this.findById(obj.getId()) == null ) {
			return -1;
			}else {
				pd.save(obj);
				return 0;
			}
	}

	@Override
	public int delete(Long id) {
		produit clt = this.findById(id);
		if(clt == null) {
			return -1;
			}else {
				pd.delete(clt);
				return 0;
			}
	}



	@Override
	public List<produit> findAll() {
		// TODO Auto-generated method stub
		return pd.findAll();
	}
	

}
