package com.example.servicefacturation;

import java.util.Date;
import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import org.springframework.data.rest.core.config.Projection;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnTransformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.Projection;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;




@Entity
@Data @NoArgsConstructor @AllArgsConstructor
	class Facture{

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Date Date_facture;
	
	private Long ClientID;
	
	
	private Long 	AbonnementID;
}

@RepositoryRestResource
 interface FactureRepository extends JpaRepository<Facture,Long>{}


@Projection(name="fullfacture",types=Facture.class)
interface FactureProjection{
	public Long getId();
	public Date getDate_facture();
	public Long getClientID();
	public Long getAbonnementID();
}

@Data
class Client{
	
	private	Long id;
	private String Nom;
	private String Prénom; 
	private String age; 
	private String email;

}

@FeignClient(name="SERVICE-PERSONNEL")
interface ClientService{
	@GetMapping("/Clients/{id}")
	public Client findClientById(@PathVariable(name="id") Long id);
}







@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class ServiceFacturationApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(ServiceFacturationApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(FactureRepository billRepository)
	{
		return args -> {
           
			
			
			billRepository.save(new Facture(null,new Date(),1L,1L));
           

	};
	}

}
