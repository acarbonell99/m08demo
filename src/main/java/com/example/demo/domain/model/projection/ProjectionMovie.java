package com.example.demo.domain.model.projection;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Set;
import java.util.UUID;

public interface ProjectionMovie {
    UUID getMovieid();
    String getTitle();

    @JsonIgnoreProperties("movies")
    Set<ProjectionActor> getActors();
}
