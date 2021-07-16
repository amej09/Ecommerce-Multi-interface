package com.example.EMI.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class produit {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String ref;
	private String desination;
	private String description ;
	private long prix ;
	private String image ;
	private int qteStock ;
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
	public String getDesination() {
		return desination;
	}
	public void setDesination(String desination) {
		this.desination = desination;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getPrix() {
		return prix;
	}
	public void setPrix(long prix) {
		this.prix = prix;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getQteStock() {
		return qteStock;
	}
	public void setQteStock(int qteStock) {
		this.qteStock = qteStock;
	}
	public produit(long id, String ref, String desination, String description, long prix, String image,
			int qteStock) {
		super();
		this.id = id;
		this.ref = ref;
		this.desination = desination;
		this.description = description;
		this.prix = prix;
		this.image = image;
		this.qteStock = qteStock;
	}
	public produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "produit [id=" + id + ", ref=" + ref + ", desination=" + desination + ", description=" + description
				+ ", prix=" + prix + ", image=" + image + ", qteStock=" + qteStock + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((desination == null) ? 0 : desination.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + (int) (prix ^ (prix >>> 32));
		result = prime * result + qteStock;
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
		produit other = (produit) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (desination == null) {
			if (other.desination != null)
				return false;
		} else if (!desination.equals(other.desination))
			return false;
		if (id != other.id)
			return false;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		if (prix != other.prix)
			return false;
		if (qteStock != other.qteStock)
			return false;
		if (ref == null) {
			if (other.ref != null)
				return false;
		} else if (!ref.equals(other.ref))
			return false;
		return true;
	}
	
	
	

}
