package com.projetoweb.vendapro.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetoweb.vendapro.entities.Order;
import com.projetoweb.vendapro.entities.User;
import com.projetoweb.vendapro.repositories.OrderRepository;
import com.projetoweb.vendapro.repositories.UserRepository;

@Configuration 
@Profile("test")
public class Testeconfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userrepository;
    
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		User u1 = new User(null, "Yevgueni Fernandes", "yevgueni@gmail.com", "977777777", "123456");     
		User u2 = new User(null, "Isnaba Bucal", "bucal@gmail.com", "977777777", "123456"); 
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1);
		
		userrepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
		
	}

}
