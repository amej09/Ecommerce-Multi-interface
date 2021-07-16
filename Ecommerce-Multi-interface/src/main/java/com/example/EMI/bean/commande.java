package com.example.EMI.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class commande {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String ref;
	private Date dateCommande ;
	private String etatCommande ;
	@OneToOne
	private produit produit ;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public Date getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
	public String getEtatCommande() {
		return etatCommande;
	}
	public void setEtatCommande(String etatCommande) {
		this.etatCommande = etatCommande;
	}
	public produit getProduit() {
		return produit;
	}
	public void setProduit(produit produit) {
		this.produit = produit;
	}
	public commande(long id, String ref, Date dateCommande, String etatCommande, com.example.EMI.bean.produit produit) {
		super();
		this.id = id;
		this.ref = ref;
		this.dateCommande = dateCommande;
		this.etatCommande = etatCommande;
		this.produit = produit;
	}
	public commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "commande [id=" + id + ", ref=" + ref + ", dateCommande=" + dateCommande + ", etatCommande="
				+ etatCommande + ", produit=" + produit + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateCommande == null) ? 0 : dateCommande.hashCode());
		result = prime * result + ((etatCommande == null) ? 0 : etatCommande.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((produit == null) ? 0 : produit.hashCode());
		result = prime * result + ((ref == null) ? 0 : ref.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		commande other = (commande) obj;
		if (dateCommande == null) {
			if (other.dateCommande != null)
				return false;
		} else if (!dateCommande.equals(other.dateCommande))
			return false;
		if (etatCommande == null) {
			if (other.etatCommande != null)
				return false;
		} else if (!etatCommande.equals(other.etatCommande))
			return false;
		if (id != other.id)
			return false;
		if (produit == null) {
			if (other.produit != null)
				return false;
		} else if (!produit.equals(other.produit))
			return false;
		if (ref == null) {
			if (other.ref != null)
				return false;
		} else if (!ref.equals(other.ref))
			return false;
		return true;
	}
	
	
	
	

}
