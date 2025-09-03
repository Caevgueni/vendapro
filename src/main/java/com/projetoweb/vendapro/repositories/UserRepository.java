package com.projetoweb.vendapro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

import com.projetoweb.vendapro.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>  {

}
