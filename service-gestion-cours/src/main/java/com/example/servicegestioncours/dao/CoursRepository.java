package com.example.servicegestioncours.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.servicegestioncours.entities.Cours;

@RepositoryRestResource
public interface CoursRepository extends JpaRepository<Cours,Long>{

}
