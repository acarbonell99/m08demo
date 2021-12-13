package com.example.demo.domain.model.projection;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Set;
import java.util.UUID;

public interface ProjectionActor {
    UUID getActorid();
    String getName();
    @JsonIgnoreProperties("actors")
    Set<ProjectionMovie> getMovies();
}
