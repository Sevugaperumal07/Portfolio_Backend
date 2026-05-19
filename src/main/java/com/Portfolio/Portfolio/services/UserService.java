package com.Portfolio.Portfolio.services;

import com.Portfolio.Portfolio.dto.UserResponse;

import java.util.List;

public interface UserService {

    List<UserResponse> getAllUsers();

    UserResponse getUserById(Long id);
}