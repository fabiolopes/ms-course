package com.bios.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bios.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);

}
