package com.abijoue.mongodb.springbootmongodbexample.resource;

import com.abijoue.mongodb.springbootmongodbexample.document.Users;
import com.abijoue.mongodb.springbootmongodbexample.repository.UserRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {

    private UserRepository userRepository;

    public UsersResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/all")
    public List<Users> getAll() {
        return userRepository.findAll();
    }
    @GetMapping("/{id}")
    public List<Users> getUser(@PathVariable int id) {
        return userRepository.findById(id);
    }
    
}
