package com.Portfolio.Portfolio.entity;

import com.Portfolio.Portfolio.enums.Category;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "skills")
public class Skills {

    @Id
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Category category;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    private Boolean deleted;

    // getters and setters
}