package com.example.servicepersonnel.entities;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.rest.core.config.Projection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor 
@ToString

@Entity
@Table(name = "Client")
@Access(value=AccessType.FIELD)
public class Client extends Personne{
	
	private int nb; 
	
	
	@Builder
	public Client(Long id, String Nom, String Prenom, int age, String email, String mdp,int nb) {
		super(id, Nom, Prenom, age, email, mdp);
		this.nb=nb;
		
	}

	
	


	
	 



}
