package com.example.servicepersonnel.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.servicepersonnel.dao.ClientRepository;

@Controller
	public class ClientController{
	    @Autowired
	    private ClientRepository clientRepository;
	  


	    @GetMapping("/")
	    public String index(Model model ){
	    	
	        return "index";
	    }
	    
	    
	    @GetMapping("/clients")
	    public String clients(Model model ){
	    	 model.addAttribute("clients",clientRepository.findAll());
	        return "clients";
	    }
	   

	}
