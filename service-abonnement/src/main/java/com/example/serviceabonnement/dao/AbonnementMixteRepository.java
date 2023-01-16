package com.example.serviceabonnement.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.serviceabonnement.entities.*;

public interface AbonnementMixteRepository extends JpaRepository<AbonnementMixte,Long>{

}
