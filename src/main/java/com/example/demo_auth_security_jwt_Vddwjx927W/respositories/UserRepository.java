package com.example.demo_auth_security_jwt_Vddwjx927W.respositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo_auth_security_jwt_Vddwjx927W.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
  
  Optional<User> findByUsername(String username);

  Boolean existsByUsername(String username);

  Boolean existsByEmail(String email);

}
