package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Box;

public interface IBoxDAO extends JpaRepository<Box, Long>{

}
