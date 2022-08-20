package com.crud.h2.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="rooms")
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Find the last value and increment from final id of db
	private Long code;
	
	private String name;
	
	@ManyToOne
    @JoinColumn(name="movie_code")
    private Movie movie;
	
	 /**Constructors */	
	public Room() {
		
	}

	/**
	 * @param code
	 * @param name
	 * @param movie
	 */
	public Room(Long code, String name, Movie movie) {
		this.code = code;
		this.name = name;
		this.movie = movie;
	}

	/**Getters y Setters*/

	/**
	 * @return the code
	 */
	public Long getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(Long code) {
		this.code = code;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the movie
	 */
	public Movie getMovie() {
		return movie;
	}

	/**
	 * @param movie the movie to set
	 */
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	//Method printing data by console
	@Override
	public String toString() {
		return "Sala [codigo=" + code + ", nombre=" + name + ", pelicula=" + movie;
	}
	
	
	
}
