package com.projetoweb.vendapro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.vendapro.entities.OrderItem;
import com.projetoweb.vendapro.entities.pk.OrderItemPK;

public interface OrderItemRepository  extends JpaRepository<OrderItem, OrderItemPK>  {

}
