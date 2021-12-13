package com.example.demo.domain.model;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "actor")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID actorid;

    public String name;
    public String imageurl;

    @ManyToMany(mappedBy = "actors")
    public Set<Movie> movies;
}
