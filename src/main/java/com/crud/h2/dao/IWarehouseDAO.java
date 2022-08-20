package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Warehouse;

public interface IWarehouseDAO extends JpaRepository<Warehouse, Long>{

}
