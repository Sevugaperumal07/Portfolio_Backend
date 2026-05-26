package com.Portfolio.Portfolio.services;

import com.Portfolio.Portfolio.entity.Skills;
import com.Portfolio.Portfolio.repository.SkillsRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SkillsService {

    private final SkillsRepository skillsRepository;

    public SkillsService(SkillsRepository skillsRepository) {
        this.skillsRepository = skillsRepository;
    }

    public List<Skills> getAllActiveSkills() {
        return skillsRepository.findByDeletedFalse();
    }
}