package com.nsti.Blue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nsti.Blue.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
								// Long is the datatype of primary key in model class
	
	
}
