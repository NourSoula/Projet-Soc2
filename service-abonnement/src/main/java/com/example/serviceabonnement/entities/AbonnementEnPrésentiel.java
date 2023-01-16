package com.example.serviceabonnement.entities;
import java.util.Date;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Entity
@Table(name = "AbonnementPrésentiel")
@Access(value=AccessType.FIELD)
public class AbonnementEnPrésentiel extends Abonnement{
	

	 @Enumerated(EnumType.STRING)
	    private Localisation localisation;
	 @Enumerated(EnumType.STRING)
	    private  Horaire horaire;
	 
	 
	
	@Builder
	public AbonnementEnPrésentiel(Long id, String Nom, int Prix, String Desc, String Durée, Date Date_Depart,
			TypeAbonnement type, TypePaiement MoyenDepaiemnt,Localisation localisation,Horaire horaire) {
		super(id, Nom, Prix, Desc, Durée, Date_Depart, type, MoyenDepaiemnt);
		this.localisation=localisation;
		this.horaire=horaire;
	}

	 

	
	

	
		
}


	
	 

