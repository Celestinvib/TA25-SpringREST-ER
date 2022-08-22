package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="movies")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Find the last value and increment from final id of db
	private Long code;
	
	private String name;
	
	private int ageRating;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "movie")
    private List<Room> room;	
    
    /**Constructors */
    
    public Movie() {
    	
    }

	/**
	 * @param code
	 * @param name
	 * @param ageRating
	 */
	public Movie(Long code, String name, int ageRating) {
		this.code = code;
		this.name = name;
		this.ageRating = ageRating;
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
	 * @return the ageRating
	 */
	public int getAgeRating() {
		return ageRating;
	}

	/**
	 * @param ageRating the ageRating to set
	 */
	public void setAgeRating(int ageRating) {
		this.ageRating = ageRating;
	}

	/**
	 * @return the room
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Room")
	public List<Room> getRoom() {
		return room;
	}

	/**
	 * @param room the room to set
	 */
	public void setRoom(List<Room> room) {
		this.room = room;
	}
	
	//Method printing data by console
	@Override
	public String toString() {
		return "Pelicula [codigo=" + code + ", nombre=" + name + ", calificación de edad=" + ageRating;
	}

    
	
	
    
}
