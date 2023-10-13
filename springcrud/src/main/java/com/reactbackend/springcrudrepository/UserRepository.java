package com.reactbackend.springcrudrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reactbackend.springcrudmodel.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
