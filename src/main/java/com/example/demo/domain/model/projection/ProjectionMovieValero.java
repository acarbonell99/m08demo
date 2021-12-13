package com.example.demo.domain.model.projection;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Set;
import java.util.UUID;

public interface ProjectionMovieValero {
    UUID getMovieid();
    String getTitle();
    String getSynopsis();
    @JsonIgnoreProperties("movies")
    Set<ProjectionActor> getActors();
}
