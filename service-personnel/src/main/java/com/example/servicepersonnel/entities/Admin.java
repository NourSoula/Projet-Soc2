package com.example.servicepersonnel.entities;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Builder;
import lombok.ToString;

@ToString
@Entity
@Table(name = "Admin")
@Access(value=AccessType.FIELD)
public class Admin extends Personne{
	private int nb; 
     @Builder
	public Admin(Long id, String Nom, String Prénom, int age, String email, String mdp,int nb) {
		super(id, Nom, Prénom, age, email, mdp);
	this.nb=nb;
	}
	
	
	
	
	
	

}
