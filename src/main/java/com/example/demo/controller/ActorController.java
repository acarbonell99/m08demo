package com.example.demo.controller;

import com.example.demo.domain.dto.ResponseList;
import com.example.demo.domain.model.Movie;
import com.example.demo.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/actors")
public class ActorController {

    @Autowired
    private ActorRepository actorRepository;

    @GetMapping("/")
    public ResponseEntity<?> findAllActors(Authentication authentication) {
        return ResponseEntity.ok().body(new ResponseList(actorRepository.findBy()));
    }
}
