package com.example.servicepersonnel;

import java.util.Date;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.keycloak.adapters.springsecurity.KeycloakConfiguration;
import org.keycloak.adapters.springsecurity.config.KeycloakWebSecurityConfigurerAdapter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.web.authentication.session.RegisterSessionAuthenticationStrategy;
import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;

import com.example.servicepersonnel.dao.ClientRepository;

import com.example.servicepersonnel.entities.Client;
import com.example.servicepersonnel.entities.Personne;

@EnableDiscoveryClient
@SpringBootApplication
public class ServicePersonnelApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicePersonnelApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ClientRepository customerRepository){
	return args ->{
	customerRepository.save(new Client(null,"eni","eni",25,"er" ,"er",25));
	customerRepository.save(new Client(null,"eni","eni",25,"er" ,"er",25));
	customerRepository.save(new Client(null,"eni","eni",25,"er" ,"er",25));
	customerRepository.save(new Client(null,"eni","eni",25,"er" ,"er",25));
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
	http.authorizeRequests().antMatchers("/clients/**").authenticated();
	}
	}
	
	

}
		

	
	

