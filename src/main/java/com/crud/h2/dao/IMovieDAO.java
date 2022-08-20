package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Movie;

public interface IMovieDAO extends JpaRepository<Movie, Long>{

}
