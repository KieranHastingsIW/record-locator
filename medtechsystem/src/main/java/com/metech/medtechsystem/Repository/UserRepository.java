package com.metech.medtechsystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metech.medtechsystem.modles.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
