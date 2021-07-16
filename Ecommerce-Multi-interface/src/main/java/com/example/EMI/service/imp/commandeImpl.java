package com.example.EMI.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.EMI.bean.client;
import com.example.EMI.bean.commande;
import com.example.EMI.bean.produit;
import com.example.EMI.dao.commandeDoa;
import com.example.EMI.service.facade.clientservice;
import com.example.EMI.service.facade.commandeService;
import com.example.EMI.service.facade.produitService;

@Service
public class commandeImpl implements commandeService {
	@Autowired
	private commandeDoa cd;
	
	@Qualifier("clientIPrompl")
	private clientservice servclipro;
	
	@Qualifier("clientVisiteurImpl")
	private clientservice servclivi;
	
	@Autowired
	private produitService ps ;
	
	@Override
	public commande findById(Long id) {
		
		if(cd.findById(id).isPresent()){
			return cd.findById(id).get();
		}else {
			return null;
		}
	}

	@Override
	public int save(commande obj) {
		produit pr = ps.findById(obj.getProduit().getId());
		commande cmd = this.findById(obj.getId());
		if(cmd!=null)
			return -1;
		if(pr == null)
			return -2;
		else
		{
			obj.setProduit(pr);
			cd.save(obj);
			return 1;
		}
		
	}

	@Override
	public int update(commande obj) {
		
		client c= obj.getCli();
		
		if(this.findById(obj.getId()) == null ) {
			return -1;
			}else {
				if(c.getType().equals("visiteur")) {
					
					
					
					this.servclivi = new clientVisiteurImpl();
					this.servclivi.save(c);
		             
				}else {
					 this.servclipro = new clientIPrompl();
					 this.servclipro.save(c);


				}
				cd.save(obj);
				return 0;
			}
	}

	@Override
	public int delete(Long id) {
		commande clt = this.findById(id);
		if(clt == null) {
			return -1;
			}else {
				cd.delete(clt);
				return 0;
			}
	}



	@Override
	public List<commande> findAll() {
		// TODO Auto-generated method stub
		return cd.findAll();
	}

}
