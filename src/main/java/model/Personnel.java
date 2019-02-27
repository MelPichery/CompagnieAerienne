package model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;

@Entity
@Inheritance(strategy=InheritanceType.JOINED) 
public abstract class Personnel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="poste")
	private String poste;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="salaire")
	private Float salaire;
	
	@Embedded
	private Adresse adresse;
	
	@Embedded
	private Contact contact;
	
	//@ManyToMany(mappedBy="personnels")
	//private Set<Vol> vols;
	

	public Personnel() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Float getSalaire() {
		return salaire;
	}

	public void setSalaire(Float salaire) {
		this.salaire = salaire;
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
		return "Personnel [id=" + id + ", poste=" + poste + ", nom=" + nom + ", salaire=" + salaire + ", adresse="
				+ adresse + ", contact=" + contact + "]";
	}
		
}
