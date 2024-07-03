package com.projeto.webServicesCourse.repositories;

import com.projeto.webServicesCourse.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
