package com.projeto.webServicesCourse.repositories;

import com.projeto.webServicesCourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
