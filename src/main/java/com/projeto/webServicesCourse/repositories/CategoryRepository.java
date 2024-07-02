package com.projeto.webServicesCourse.repositories;

import com.projeto.webServicesCourse.entities.Category;
import com.projeto.webServicesCourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
