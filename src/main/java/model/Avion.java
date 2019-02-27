package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="avion")
public class Avion {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="numero")
	private String numero;
	
	@Column(name="marque")
	private String marque;
	
	@Column(name="type")
	private String type;
	
	@Column(name="capacite_max_passager")
	private Integer capaciteMaxPassager;
	
	@Column(name="consommation_moyenne")
	private Float consommationMoyenne;
	
	@Column(name="contenance_max_carburant")
	private Float contenanceMaxCarburant;
	
	@Column(name="coefficient_surconsommation")
	private Float coefficientSurconsommation;

	
	public Avion() {
		
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

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getCapaciteMaxPassager() {
		return capaciteMaxPassager;
	}

	public void setCapaciteMaxPassager(Integer capaciteMaxPassager) {
		this.capaciteMaxPassager = capaciteMaxPassager;
	}

	public Float getConsommationMoyenne() {
		return consommationMoyenne;
	}

	public void setConsommationMoyenne(Float consommationMoyenne) {
		this.consommationMoyenne = consommationMoyenne;
	}

	public Float getContenanceMaxCarburant() {
		return contenanceMaxCarburant;
	}

	public void setContenanceMaxCarburant(Float contenanceMaxCarburant) {
		this.contenanceMaxCarburant = contenanceMaxCarburant;
	}

	public Float getCoefficientSurconsommation() {
		return coefficientSurconsommation;
	}

	public void setCoefficientSurconsommation(Float coefficientSurconsommation) {
		this.coefficientSurconsommation = coefficientSurconsommation;
	}

	
	
	@Override
	public String toString() {
		return "Avion [id=" + id + ", numero=" + numero + ", marque=" + marque + ", type=" + type
				+ ", capaciteMaxPassager=" + capaciteMaxPassager + ", consommationMoyenne=" + consommationMoyenne
				+ ", contenanceMaxCarburant=" + contenanceMaxCarburant + ", coefficientSurconsommation="
				+ coefficientSurconsommation + "]";
	}
	
		
}
