package com.Portfolio.Portfolio.dto;

import com.Portfolio.Portfolio.entity.User;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class UserResponse {

    private Long id;
    private String name;
    private String role;
    private String email;
    private String location;
    private String bio;
    private String githubUrl;
    private String linkedinUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static UserResponse fromEntity(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .name(user.getName())
                .role(user.getRole())
                .email(user.getEmail())
                .location(user.getLocation())
                .bio(user.getBio())
                .githubUrl(user.getGithubUrl())
                .linkedinUrl(user.getLinkedinUrl())
                .createdAt(user.getCreatedAt())
                .updatedAt(user.getUpdatedAt())
                .build();
    }
}