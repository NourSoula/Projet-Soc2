package com.example.serviceabonnement;


import java.util.Date;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.keycloak.adapters.springsecurity.KeycloakConfiguration;
import org.keycloak.adapters.springsecurity.config.KeycloakWebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.web.authentication.session.RegisterSessionAuthenticationStrategy;
import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;

import com.example.serviceabonnement.dao.AbonnementEnLigneRepository;
import com.example.serviceabonnement.dao.AbonnementEnPrésentielRepository;
import com.example.serviceabonnement.entities.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.keycloak.adapters.springsecurity.KeycloakConfiguration;
import org.keycloak.adapters.springsecurity.config.KeycloakWebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.web.authentication.session.RegisterSessionAuthenticationStrategy;
import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceAbonnementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceAbonnementApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(AbonnementEnLigneRepository customerRepository,AbonnementEnPrésentielRepository ap){
	return args ->{
	customerRepository.save(new AbonnementEnLigne(null,"eni",200,"eni","eni",new Date(),TypeAbonnement.Annuel,TypePaiement.CARTE ,2));
	
	customerRepository.findAll().forEach(System.out::println);
	
	};}
	
	
	@Configuration
	class keycloakConfig{
	@Bean
	KeycloakSpringBootConfigResolver keycloakConfigResolver(){
	return new KeycloakSpringBootConfigResolver();
	}
	}
	@KeycloakConfiguration
	class SercurityConfiguration extends KeycloakWebSecurityConfigurerAdapter{
	@Override
	protected SessionAuthenticationStrategy sessionAuthenticationStrategy() {
	return new RegisterSessionAuthenticationStrategy(new SessionRegistryImpl());
	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	auth.authenticationProvider(keycloakAuthenticationProvider());
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	super.configure(http);
	http.authorizeRequests().antMatchers("/abonnement/**").authenticated();
	}
	}
}


