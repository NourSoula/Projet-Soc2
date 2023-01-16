package com.example.servicepersonnel.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.servicepersonnel.entities.Admin;
import com.example.servicepersonnel.entities.Chorégraphe;

public interface ChorégrapheRepository extends JpaRepository<Chorégraphe,Long>{

}


