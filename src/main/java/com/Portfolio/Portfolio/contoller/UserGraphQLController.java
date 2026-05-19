package com.Portfolio.Portfolio.contoller;

import com.Portfolio.Portfolio.dto.UserResponse;
import com.Portfolio.Portfolio.services.UserService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserGraphQLController {

    private final UserService userService;

    public UserGraphQLController(UserService userService) {
        this.userService = userService;
    }

    @QueryMapping
    public List<UserResponse> getAllUsers() {
        return userService.getAllUsers();
    }

    @QueryMapping
    public UserResponse getUserById(@Argument Long id) {
        return userService.getUserById(id);
    }
}