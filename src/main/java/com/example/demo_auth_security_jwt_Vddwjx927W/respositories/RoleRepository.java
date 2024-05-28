package com.example.demo_auth_security_jwt_Vddwjx927W.respositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo_auth_security_jwt_Vddwjx927W.models.ERole;
import com.example.demo_auth_security_jwt_Vddwjx927W.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  
  Optional<Role> findByName(ERole name);

}
