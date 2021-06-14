package com.abijoue.mongodb.springbootmongodbexample.config;

import com.abijoue.mongodb.springbootmongodbexample.document.Users;
import com.abijoue.mongodb.springbootmongodbexample.repository.UserRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {


    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return strings -> {
            userRepository.save(new Users(1, "Peter", "Development", 3000));
            userRepository.save(new Users(2, "Sam", "Operations", 2000));
        };
    }

}
