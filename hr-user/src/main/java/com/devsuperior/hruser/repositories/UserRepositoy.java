package com.devsuperior.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.hruser.entities.User;

public interface UserRepositoy extends JpaRepository<User, Long>{
	
	public User findByEmail(String email);

}
