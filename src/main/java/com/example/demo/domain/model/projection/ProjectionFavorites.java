package com.example.demo.domain.model.projection;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Set;

public interface ProjectionFavorites {
    @JsonIgnoreProperties("favoritedby")
    Set<ProjectionMovieFavorited> getFavorites();
}
