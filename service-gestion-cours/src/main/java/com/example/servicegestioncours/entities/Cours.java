
package com.example.servicegestioncours.entities;

import java.util.Date;


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

public class Cours {
	

		 @Id
		    @GeneratedValue(strategy = GenerationType.TABLE)
		    private  Long id;
		    private String Nom;
            private String Desc;
	        private String Durée;
	        
	     
		
		
	}

