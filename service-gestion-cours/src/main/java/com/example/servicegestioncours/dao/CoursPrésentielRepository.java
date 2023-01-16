package com.example.servicegestioncours.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.servicegestioncours.entities.CoursEnLigne;


@RepositoryRestResource
public interface CoursPrésentielRepository extends JpaRepository<CoursEnLigne,Long>{ 

}