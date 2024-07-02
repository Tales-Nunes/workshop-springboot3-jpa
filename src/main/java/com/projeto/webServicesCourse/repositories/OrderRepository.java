package com.projeto.webServicesCourse.repositories;

import com.projeto.webServicesCourse.entities.Order;
import com.projeto.webServicesCourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
