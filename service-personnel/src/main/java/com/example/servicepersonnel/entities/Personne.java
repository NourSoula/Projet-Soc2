package com.example.servicepersonnel.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;



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

public class Personne {
	

		 @Id
		    @GeneratedValue(strategy = GenerationType.TABLE)
		    private  Long id;
		    private String Nom;
		    private String Prénom;
            private int age;
            private String email;
	        private String mdp;
		  
		
		 
		
		
	}

