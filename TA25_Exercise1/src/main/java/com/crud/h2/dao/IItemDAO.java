package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Item;

public interface IItemDAO  extends JpaRepository<Item, Long>{

}
