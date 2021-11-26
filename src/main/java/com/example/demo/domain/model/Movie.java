package com.example.demo.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID movieid;

    public String title;
    public String imageurl;

    @ManyToMany
    @JoinTable(name = "movie_actor", joinColumns = @JoinColumn(name = "movieid"), inverseJoinColumns = @JoinColumn(name = "actorid"))
    @JsonIgnoreProperties("movies")
    public Set<Actor> actors;

    @ManyToMany
    @JoinTable(name = "movie_genre", joinColumns = @JoinColumn(name = "movieid"), inverseJoinColumns = @JoinColumn(name = "genreid"))
    @JsonIgnoreProperties("movies")
    public Set<Genre> genres;
}
