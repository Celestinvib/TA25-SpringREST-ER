package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Movie;

public interface IMovieService {
	//CRUD methods
	public List<Movie> listMovies(); //List All 
	
	public Movie saveMovie(Movie movie);//Save a new movie "CREATE"
	
	public Movie movieXID(Long code); //Read data from a movie "READ"
			
	public Movie updateMovie(Movie movie); //Update movie data "UPDATE"
	
	public void deleteMovie(Long code);// Delete a movie via id "DELETE"
}
