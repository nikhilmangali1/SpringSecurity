package com.example.SpringSecurity1.service;


import com.example.SpringSecurity1.model.CustomUserDetails;
import com.example.SpringSecurity1.model.User;
import com.example.SpringSecurity1.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if(Objects.isNull(user)){
            System.out.println("User not available in DB");
            throw  new UsernameNotFoundException("User not found!");
        }
        return new CustomUserDetails(user);
    }
}
