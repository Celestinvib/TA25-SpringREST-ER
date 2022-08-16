package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IMovieDAO;
import com.crud.h2.dto.Movie;

@Service
public class MovieServiceImpl implements IMovieService{
	//We use the methods of the IMovieDAO interface, it is as if we were instantiating.
	@Autowired
	IMovieDAO iMovieDAO;

	@Override
	public List<Movie> listMovies() {
		
		return iMovieDAO.findAll();
	}

	@Override
	public Movie saveMovie(Movie movie) {
		
		return iMovieDAO.save(movie);
	}

	@Override
	public Movie movieXID(Long code) {
		
		return iMovieDAO.findById(code).get();
	}

	@Override
	public Movie updateMovie(Movie movie) {
		
		return iMovieDAO.save(movie);
	}

	@Override
	public void deleteMovie(Long code) {
		
		iMovieDAO.deleteById(code);	
	}
	
	
}
