package com.diginamic.cieAerienne2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entitymanager.DatabaseHandle;
import model.Adresse;
import model.Avion;
import model.Contact;
import model.Passager;
import model.Personnel;
import model.PersonnelNavigant;
import model.PersonnelNonNavigant;
import model.Vol;

public class Main {

	public static void main(String[] args) {
		
EntityManager em = DatabaseHandle.getEntityManagerFactory();
		
		EntityTransaction transaction = em.getTransaction();
		
		
		// Begin the transaction
		transaction.begin();

		//create avions
		Avion a1 = new Avion();
		a1.setCapaciteMaxPassager(500);
		a1.setCoefficientSurconsommation(2.3f);
		a1.setConsommationMoyenne(50f);
		a1.setContenanceMaxCarburant(900f);
		a1.setMarque("airbus");
		a1.setNumero("42L36");
		a1.setType("A380");
		em.persist(a1);
		
		Avion a2 = new Avion();
		a2.setCapaciteMaxPassager(500);
		a2.setCoefficientSurconsommation(2.3f);
		a2.setConsommationMoyenne(50f);
		a2.setContenanceMaxCarburant(900f);
		a2.setMarque("airbus");
		a2.setNumero("42L46");
		a2.setType("A180");
		em.persist(a2);
		
		Avion a3 = new Avion();
		a3.setCapaciteMaxPassager(500);
		a3.setCoefficientSurconsommation(2.3f);
		a3.setConsommationMoyenne(50f);
		a3.setContenanceMaxCarburant(900f);
		a3.setMarque("boeing");
		a3.setNumero("666A2");
		a3.setType("Boeing Boeing");
		em.persist(a3);
		
		//create passagers
		Passager p1 = new Passager();
		p1.setNom("Jane DOE");
		p1.setNationalite("américaine");
		p1.setAdresse(new Adresse("36 rue de la rue","44000","Nantes"));
		p1.setContact(new Contact("02.04.05.06.00"));
		em.persist(p1);
		
		Passager p2 = new Passager();
		p2.setNom("Camille DURAND");
		p2.setNationalite("française");
		p2.setAdresse(new Adresse("36 rue beausoleil","44000","Nantes"));
		p2.setContact(new Contact("02.04.05.06.12"));
		em.persist(p2);
		
		Passager p3 = new Passager();
		p3.setNom("Serena WILLIAMS");
		p3.setNationalite("américaine");
		p3.setAdresse(new Adresse("1 rue beauregard","44000","Nantes"));
		p3.setContact(new Contact("06.04.05.06.12"));
		em.persist(p3);
		
		Set<Passager> listpassager = new HashSet<Passager>();
		listpassager.add(p1);
		listpassager.add(p2);
		listpassager.add(p3);
		
		//create personnels
		PersonnelNavigant pn1 = new PersonnelNavigant();
		pn1.setNom("Flint EASTWOOD");
		pn1.setPoste("pilote");
		pn1.setSalaire(12000f);
		pn1.setAdresse(new Adresse("1 rue de la lune","44000","Nantes"));
		pn1.setContact(new Contact("04.00.01.02.03"));
		em.persist(pn1);
		
		PersonnelNavigant pn2 = new PersonnelNavigant();
		pn2.setNom("Dominique Henry");
		pn2.setPoste("Hotesse de l'air");
		pn2.setSalaire(12000f);
		pn2.setAdresse(new Adresse("1 rue du jour","44000","Nantes"));
		pn2.setContact(new Contact("04.36.01.02.03"));
		em.persist(pn2);
		
		PersonnelNonNavigant pnn1 = new PersonnelNonNavigant();
		pnn1.setNom("Gérard George");
		pnn1.setPoste("agent d'accueil");
		pnn1.setSalaire(6000f);
		pnn1.setAdresse(new Adresse("la cité","44000","Nantes"));
		pnn1.setContact(new Contact("04.00.01.02.03"));
		em.persist(pnn1);
		
		PersonnelNonNavigant pnn2 = new PersonnelNonNavigant();
		pnn2.setNom("Thierry Henry");
		pnn2.setPoste("Agent de circulation");
		pnn2.setSalaire(2000f);
		pnn2.setAdresse(new Adresse("33 rue du docteur","44000","Nantes"));
		pnn2.setContact(new Contact("04.36.01.02.03"));
		em.persist(pnn2);
		
		Set<Personnel> listpersonnel = new HashSet<Personnel>();
		listpersonnel.add(pn1);
		listpersonnel.add(pn2);
		listpersonnel.add(pnn1);
		listpersonnel.add(pnn2);
		
		
		//create vols
		Vol v1 = new Vol();
		v1.setAvion(a1);
		v1.setDateArrivee(LocalDate.now());
		v1.setDateDepart(LocalDate.now());
		v1.setDistance(800f);
		v1.setHeureArrivee(LocalDateTime.now());
		v1.setHeureDepart(LocalDateTime.now());
		v1.setNumero("32L36");
		v1.setPassagers(listpassager);
		v1.setPrimeDepart(100f);
		v1.setVilleArrivee("Nantes");
		v1.setVilleDepart("Montpellier");
		v1.setPersonnels(listpersonnel);
		em.persist(v1);
		
		Vol v2 = new Vol();
		v2.setAvion(a3);
		v2.setDateArrivee(LocalDate.now());
		v2.setDateDepart(LocalDate.now());
		v2.setDistance(1000f);
		v2.setHeureArrivee(LocalDateTime.now());
		v2.setHeureDepart(LocalDateTime.now());
		v2.setNumero("50L22");
		v2.setPassagers(listpassager);
		v2.setPrimeDepart(100f);
		v2.setVilleArrivee("Nantes");
		v2.setVilleDepart("Porto");
		v2.setPersonnels(listpersonnel);
		em.persist(v2);
		
		
		
		transaction.commit();
		
		em.close();
		System.exit(0);

	}

}
