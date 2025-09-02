package com.projetoweb.vendapro.resurces;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoweb.vendapro.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResurce {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		
	
		User u= new User(2L, "carlos", "itais1@gmail.com", "99999999", "gfdudy");
		
		return ResponseEntity.ok(u);
		
		
		
		
	}

}
