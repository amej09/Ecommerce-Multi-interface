package com.example.EMI.ws.provided;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EMI.bean.produit;
import com.example.EMI.service.facade.produitService;

@RestController
@RequestMapping("EMI/produit")
public class produitRest {
	@Autowired
	private produitService cs;

	@GetMapping("/id/{id}")
	public produit findById(@PathVariable Long id) {
		return cs.findById(id);
	}
	
	@PostMapping("/save/")
	public int save(@RequestBody produit obj) {
		 return cs.save(obj);
	}

	@GetMapping("/")
	public List<produit> findAll() {
		return cs.findAll();
	}
	@PutMapping("/update/")
	public int update(@RequestBody produit obj) {
		return cs.update(obj);
	}

	@DeleteMapping("/id/{id}")
	public int delete(@PathVariable Long id) {
		return cs.delete(id);
	}
}
