package com.abijoue.mongodb.springbootmongodbexample.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.abijoue.mongodb.springbootmongodbexample.document.Users;

public interface UserRepository extends MongoRepository<Users, Integer> {

	List<Users> findById(int id);
}
