package com.revature.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.revature.models.GetHeroRequest;
import com.revature.models.GetHeroResponse;
import com.revature.models.SuperHero;
import com.revature.repositories.SuperHeroRepository;

@Endpoint
public class SuperHeroEndpoint {

	private static final String NAMESPACE_URI = "http://www.example.org/SuperHero";
	private SuperHeroRepository superHeroRepository;
	
	@Autowired
	public SuperHeroEndpoint(SuperHeroRepository superHeroRepository) {
		super();
		this.superHeroRepository = superHeroRepository;
	}
	
	@PayloadRoot(namespace=NAMESPACE_URI, localPart="getHeroRequest")
	@ResponsePayload
	public GetHeroResponse getSuperHero(@RequestPayload GetHeroRequest request) {
		SuperHero hero = superHeroRepository.findSuperHeroByName(request.getName());
		
		//Create response and set superhero, then return response
		GetHeroResponse response = new GetHeroResponse();
		response.setSuperHero(hero);
		return response;
	}
	
	
}