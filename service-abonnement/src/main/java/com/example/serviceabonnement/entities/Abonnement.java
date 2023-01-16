package com.example.serviceabonnement.entities;


import java.util.Date;
import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor 

@ToString
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Abonnement {
	

		 @Id
		    @GeneratedValue(strategy = GenerationType.TABLE)
		    private  Long id;
		    private String Nom;
		    private int Prix;
            private String Desc;
	        private String Durée;
	        private Date Date_Depart; 
	        @Enumerated(EnumType.STRING)
	        private TypeAbonnement  type_Abonnement;
	        @Enumerated(EnumType.STRING)
	         private  TypePaiement MoyenDepaiemnt;
		
		
	}

