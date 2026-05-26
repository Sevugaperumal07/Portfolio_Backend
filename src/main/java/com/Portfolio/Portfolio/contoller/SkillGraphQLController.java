package com.Portfolio.Portfolio.contoller;

import com.Portfolio.Portfolio.entity.Skills;
import com.Portfolio.Portfolio.services.SkillsService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class SkillGraphQLController {

    private final SkillsService skillsService;

    public SkillGraphQLController(SkillsService skillsService) {
        this.skillsService = skillsService;
    }

    @QueryMapping
    public List<Skills> skills() {
        return skillsService.getAllActiveSkills();
    }
}