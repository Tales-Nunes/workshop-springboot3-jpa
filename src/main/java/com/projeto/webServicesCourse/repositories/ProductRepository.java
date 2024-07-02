package com.projeto.webServicesCourse.repositories;

import com.projeto.webServicesCourse.entities.Product;
import com.projeto.webServicesCourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
