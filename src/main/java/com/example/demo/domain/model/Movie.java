package com.example.demo.domain.model;

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
    @JoinTable(name = "movie_actor", joinColumns = @JoinColumn(name ="movieid"), inverseJoinColumns = @JoinColumn(name = "actorid"))
    public Set<Actor> actors;
}
