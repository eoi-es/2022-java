package com.example.demo.web;

import com.example.demo.data.entity.People;
import com.example.demo.data.repository.PeopleRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PeopleController {

    private final PeopleRepository peopleRepository;

    public PeopleController(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @GetMapping("/")
    public List<People> getPeople() {
        return this.peopleRepository.findAll();
    }
}
