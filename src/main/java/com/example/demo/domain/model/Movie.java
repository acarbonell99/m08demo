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

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "movie_actor", joinColumns = @JoinColumn(name ="movieid"), inverseJoinColumns = @JoinColumn(name = "actorid"))
    public Set<Actor> actors;

    @ManyToMany
    @JoinTable(name = "movie_genre", joinColumns = @JoinColumn(name ="movieid"), inverseJoinColumns = @JoinColumn(name = "genreid"))
    public Set<Genre> genres;

    @ManyToMany
    @JoinTable(name = "favorite", joinColumns = @JoinColumn(name ="movieid"), inverseJoinColumns = @JoinColumn(name = "userid"))
    public Set<User> favoritedby;
}
