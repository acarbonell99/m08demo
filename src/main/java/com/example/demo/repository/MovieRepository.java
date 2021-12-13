package com.example.demo.repository;

import com.example.demo.domain.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface MovieRepository extends JpaRepository<Movie, UUID> {

    <T> List<T> findBy(Class<T> type);
}
