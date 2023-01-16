package com.example.servicegestioncours;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.example.servicegestioncours.dao.CoursEnLigneRepository;
import com.example.servicegestioncours.dao.CoursPrésentielRepository;
import com.example.servicegestioncours.entities.CoursEnLigne;


@EnableDiscoveryClient
@SpringBootApplication
public class ServiceGestionCoursApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceGestionCoursApplication .class, args);
	}


	
	@Bean
	CommandLineRunner start(CoursEnLigneRepository customerRepository1,CoursPrésentielRepository customerRepository2){
	return args ->{
	customerRepository1.save(new CoursEnLigne(null,"eni","eni","eni",2));
	customerRepository2.save(new CoursEnLigne(null,"eni","eni","eni",2));
	
	customerRepository1.findAll().forEach(System.out::println);
	};}
	
	


}