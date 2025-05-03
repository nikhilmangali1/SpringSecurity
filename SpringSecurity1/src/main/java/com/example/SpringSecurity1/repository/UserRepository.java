package com.example.SpringSecurity1.repository;


import com.example.SpringSecurity1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUsername(String username);
    User findByPassword(String password);
}
