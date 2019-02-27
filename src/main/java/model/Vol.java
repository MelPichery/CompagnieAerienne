package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="vol")
public class Vol {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="numero")
	private String numero;
	
	@Column(name="date_depart")
	private LocalDate dateDepart;
	
	@Column(name="date_arrivee")
	private LocalDate dateArrivee;
	
	@Column(name="heure_depart")
	private LocalDateTime heureDepart;
	
	@Column(name="heure_arrivee")
	private LocalDateTime heureArrivee;
	
	@Column(name="distance")
	private Float distance;
	
	@Column(name="ville_depart")
	private String villeDepart;
	
	@Column(name="ville_arrivee")
	private String villeArrivee;
	
	@Column(name="prime_depart")
	private Float primeDepart;

	@ManyToMany(cascade = { CascadeType.ALL })
	    @JoinTable(
	        name = "vol_passager", 
	        joinColumns = { @JoinColumn(name = "id_vol",referencedColumnName="id") }, 
	        inverseJoinColumns = { @JoinColumn(name = "id_passager",referencedColumnName="id") }
	    )
	private Set<Passager> passagers;
	
	@ManyToMany(cascade = { CascadeType.ALL })
	    @JoinTable(
	        name = "vol_personnel", 
	        joinColumns = { @JoinColumn(name = "id_vol" , referencedColumnName="id") }, 
	        inverseJoinColumns = { @JoinColumn(name = "id_personnel" , referencedColumnName="id") }
	    )
	private Set<Personnel> personnels;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="avion_id")
	private Avion avion;
	
	public Vol() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDate getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(LocalDate dateDepart) {
		this.dateDepart = dateDepart;
	}

	public LocalDate getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(LocalDate dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public LocalDateTime getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(LocalDateTime heureDepart) {
		this.heureDepart = heureDepart;
	}

	public LocalDateTime getHeureArrivee() {
		return heureArrivee;
	}

	public void setHeureArrivee(LocalDateTime heureArrivee) {
		this.heureArrivee = heureArrivee;
	}

	public Float getDistance() {
		return distance;
	}

	public void setDistance(Float distance) {
		this.distance = distance;
	}

	public String getVilleDepart() {
		return villeDepart;
	}

	public void setVilleDepart(String villeDepart) {
		this.villeDepart = villeDepart;
	}

	public String getVilleArrivee() {
		return villeArrivee;
	}

	public void setVilleArrivee(String villeArrivee) {
		this.villeArrivee = villeArrivee;
	}

	public Float getPrimeDepart() {
		return primeDepart;
	}

	public void setPrimeDepart(Float primeDepart) {
		this.primeDepart = primeDepart;
	}

	
	public Set<Passager> getPassagers() {
		return passagers;
	}

	public void setPassagers(Set<Passager> passagers) {
		this.passagers = passagers;
	}

	public Set<Personnel> getPersonnels() {
		return personnels;
	}

	public void setPersonnels(Set<Personnel> personnels) {
		this.personnels = personnels;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	@Override
	public String toString() {
		return "Vol [id=" + id + ", numero=" + numero + ", dateDepart=" + dateDepart + ", dateArrivee=" + dateArrivee
				+ ", heureDepart=" + heureDepart + ", heureArrivee=" + heureArrivee + ", distance=" + distance
				+ ", villeDepart=" + villeDepart + ", villeArrivee=" + villeArrivee + ", primeDepart=" + primeDepart
				+ ", passagers=" + passagers + ", personnels=" + personnels + ", avion=" + avion + "]";
	}
		
}
