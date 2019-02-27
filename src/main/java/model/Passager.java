package model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="passager")
public class Passager {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="nationalite")
	private String nationalite;
	
	@Embedded
	private Adresse adresse;
	
	@Embedded
	private Contact contact;
	
	//@ManyToMany(mappedBy="passagers")
	//private Set<Vol> vols;
	

	public Passager() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
	

	/*public Set<Vol> getVols() {
		return vols;
	}

	public void setVols(Set<Vol> vols) {
		this.vols = vols;
	}*/

	@Override
	public String toString() {
		return "Passager [id=" + id + ", nom=" + nom + ", nationalite=" + nationalite + ", adresse=" + adresse
				+ ", contact=" + contact + "]";
	}
	
	
}
