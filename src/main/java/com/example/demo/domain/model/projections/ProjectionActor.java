package com.example.demo.domain.model.projections;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Set;
import java.util.UUID;


public interface ProjectionActor {
    UUID getActorid();
    String getName();
    String getImageurl();

    @JsonIgnoreProperties("actors")
    Set<ProjectionMovie> getMovies();
}
