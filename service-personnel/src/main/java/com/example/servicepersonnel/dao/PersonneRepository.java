package com.example.servicepersonnel.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.servicepersonnel.entities.Personne;


public interface PersonneRepository  extends JpaRepository<Personne,Long>{

}
