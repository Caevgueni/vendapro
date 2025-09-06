package com.projetoweb.vendapro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.vendapro.entities.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>  {

}
