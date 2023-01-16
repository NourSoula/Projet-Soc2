package com.example.servicegestioncours.entities;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor 
@ToString
@Entity
@Table(name = "CoursPrésentiel")
@Access(value=AccessType.FIELD)
public class CoursPrésentiel extends Cours{
	private int nb;
	
@Builder
	public CoursPrésentiel(Long id, String Nom, String Desc, String Durée,int nb) {
		super(id, Nom, Desc, Durée);
		this.nb=nb;
		
	}

	
	
	
}
