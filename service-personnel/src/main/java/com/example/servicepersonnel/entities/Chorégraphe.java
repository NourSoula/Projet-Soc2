package com.example.servicepersonnel.entities;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.ToString;

@ToString
@Entity
@Table(name = "Chorégraphe")
@Access(value=AccessType.FIELD)
public class Chorégraphe extends Personne{public Chorégraphe() {
		super();
		// TODO Auto-generated constructor stub
	}

private int nb; 
	public Chorégraphe(Long id, String Nom, String Prénom, int age, String email, String mdp,int nb) {
		super(id, Nom, Prénom, age, email, mdp);
		// TODO Auto-generated constructor stub
		this.nb=nb;
	}
	
	
	

}
