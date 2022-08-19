package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Manufacturer;


public interface IManufacturerDAO extends JpaRepository<Manufacturer, Long>{

}
