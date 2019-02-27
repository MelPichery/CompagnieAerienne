package model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
public class Contact {

	
	@Column(name="telephone")
	private String telephone;

	public Contact() {
		
	}

	

	public Contact(String telephone) {
		super();
		this.telephone = telephone;
	}


	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Contact [telephone=" + telephone + "]";
	}
		
}
