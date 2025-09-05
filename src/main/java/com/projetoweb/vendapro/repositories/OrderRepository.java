package com.projetoweb.vendapro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

import com.projetoweb.vendapro.entities.Order;
import com.projetoweb.vendapro.entities.User;

public interface OrderRepository  extends JpaRepository<Order, Long>  {

}
