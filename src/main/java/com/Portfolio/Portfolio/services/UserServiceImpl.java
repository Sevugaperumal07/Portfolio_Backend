package com.Portfolio.Portfolio.services;

import com.Portfolio.Portfolio.dto.UserResponse;
import com.Portfolio.Portfolio.entity.User;
import com.Portfolio.Portfolio.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserResponse> getAllUsers() {
        return userRepository.findByDeletedFalse()
                .stream()
                .map(UserResponse::fromEntity)
                .toList();
    }

    @Override
    public UserResponse getUserById(Long id) {
        User user = userRepository.findById(id)
                .filter(u -> !Boolean.TRUE.equals(u.getDeleted()))
                .orElseThrow(() -> new RuntimeException("User not found"));

        return UserResponse.fromEntity(user);
    }
}