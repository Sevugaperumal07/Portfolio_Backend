package com.Portfolio.Portfolio.repository;

import com.Portfolio.Portfolio.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByDeletedFalse();
}   