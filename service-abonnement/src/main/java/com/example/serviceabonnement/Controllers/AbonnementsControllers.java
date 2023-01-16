package com.example.serviceabonnement.Controllers;
	
	

	import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.keycloak.adapters.AdapterDeploymentContext;
import org.keycloak.adapters.KeycloakDeployment;
import org.keycloak.adapters.spi.HttpFacade;
import org.keycloak.adapters.springsecurity.facade.SimpleHttpFacade;
import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.serviceabonnement.dao.AbonnementEnLigneRepository;
import com.example.serviceabonnement.dao.AbonnementEnPrésentielRepository;
import com.example.serviceabonnement.dao.AbonnementMixteRepository;
import com.example.serviceabonnement.dao.AbonnementRepository;



	@Controller
		public class AbonnementsControllers{
		    @Autowired
		    private AbonnementEnLigneRepository ARepository;
		    
		    @Autowired
		    private AbonnementEnPrésentielRepository ApRepository;
		    
		    @Autowired
		    private AbonnementMixteRepository AmRepository;
		  
			

			@GetMapping("/payer")
   public String payer(Model model ){
		    	
		        return "/payer";
			}
			
		    @GetMapping("/")
		    public String index(Model model ){
		    	
		        return "index";
		    }
		 
		    
		    @GetMapping("/abonnementsEnLigne")
		    public String abonnementsEnLigne(Model model ){
		    	 model.addAttribute("abonnementsEnLigne",ARepository.findAll());
		        return "abonnementsEnLigne";
		    }
		    @GetMapping("/abonnementpresentiel")
		    public String abonnementpresentiel(Model model ){
		    	 model.addAttribute("abonnementpresentiel",ApRepository.findAll());
		        return "abonnementpresentiel";
		    }
		    
		    @GetMapping("/abonnementmixte")
		    public String abonnementmixte(Model model ){
		    	 model.addAttribute("abonnementmixte",AmRepository.findAll());
		        return "abonnementmixte";
		    }
		    @GetMapping("/abonnement")
		    public String abonnement(Model model ){
		    
		        return "abonnement";
		    }
		    
		  
		    @GetMapping("/login")
		    public String Login(Model model ){
		        return "login";
		    }
		    
		    
		    
		  
		}

