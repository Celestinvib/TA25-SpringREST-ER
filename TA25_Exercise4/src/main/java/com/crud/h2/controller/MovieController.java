package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Movie;
import com.crud.h2.service.MovieServiceImpl;

@RestController
@RequestMapping("/api")
public class MovieController {

	@Autowired
	MovieServiceImpl movieServiceImpl;
	
	@GetMapping("/peliculas")
	public List<Movie> listMovies(){
		return movieServiceImpl.listMovies();
	}
	
	@PostMapping("/peliculas")
	public Movie saveMovie(@RequestBody Movie movie) {
		
		return movieServiceImpl.saveMovie(movie);
	}
	
	@GetMapping("/peliculas/{code}")
	public Movie movieXID(@PathVariable(name="code") Long code) {
		
		Movie movie_xid= new Movie();
		
		movie_xid= movieServiceImpl.movieXID(code);
		
		System.out.println("Pelicula XID: "+movie_xid);
		
		return movie_xid;
	}
	
	@PutMapping("/peliculas/{code}")
	public Movie updateMovie(@PathVariable(name="code")Long code,@RequestBody Movie movie) {
		
		Movie movieSelected= new Movie();
		Movie movieUpdated = new Movie();
		
		movieSelected= movieServiceImpl.movieXID(code);
		
		movieSelected.setName(movie.getName());
		movieSelected.setAgeRating(movie.getAgeRating());
		
	
		movieUpdated = movieServiceImpl.updateMovie(movieSelected);
		
		System.out.println("La pelicula actualizada es: "+ movieUpdated);
		
		return movieUpdated;
	}
	
	@DeleteMapping("/peliculas/{code}")
	public void deleteMovie(@PathVariable(name="code")Long code) {
		movieServiceImpl.deleteMovie(code);
	}		
}
