package com.fooddelivery.config;

import com.fooddelivery.entity.user.UserEntity;
import com.fooddelivery.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {
    @Bean
    CommandLineRunner init(UserRepository userRepository) {
        return args -> {
            if (userRepository.count() == 0) {
                UserEntity u = UserEntity.builder()
                        .email("alice@example.com")
                        .name("Alice")
                        .password("secret") // not hashed for demo only
                        .build();
                userRepository.save(u);
            }
        };
    }
}
