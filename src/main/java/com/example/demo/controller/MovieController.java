package com.example.demo.controller;

import com.example.demo.domain.dto.ResponseList;
import com.example.demo.domain.model.Movie;
import com.example.demo.domain.model.projection.ProjectionMovie;
import com.example.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/")
    public ResponseEntity<?> findAllMovies(Authentication authentication) {
        return ResponseEntity.ok().body(new ResponseList(movieRepository.findBy(ProjectionMovie.class)));
    }

    @PostMapping("/")
    public Movie createMovie(@RequestBody Movie movie, Authentication authentication) {
        return movieRepository.save(movie);
    }
}
