package com.example.serviceabonnement.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.AccessType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@AllArgsConstructor
@NoArgsConstructor 
@ToString
@Entity
@Table(name = "AbonnementEnLigne")
@Access(value=AccessType.FIELD)
public class AbonnementEnLigne extends Abonnement{
	
	private int  nb_compte;
	@Builder
	public AbonnementEnLigne(Long id, String Nom, int Prix, String Desc, String Durée, Date Date_Depart,
			TypeAbonnement type,TypePaiement MoyenDepaiemnt,int  nb_compte) {
		super(id, Nom, Prix, Desc, Durée, Date_Depart, type, MoyenDepaiemnt);
		this.nb_compte=nb_compte;
	};

	
	

		
	

	
	
	

	
	 



}
