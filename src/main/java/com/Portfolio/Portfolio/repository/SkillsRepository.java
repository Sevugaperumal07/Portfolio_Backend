
package com.Portfolio.Portfolio.repository;

import com.Portfolio.Portfolio.entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SkillsRepository extends JpaRepository<Skills, Long> {
    List<Skills> findByDeletedFalse();
}