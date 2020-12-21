package com.sb.rest.swagger.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.rest.swagger.api.model.Book;


public interface BookRepositoryDao extends JpaRepository<Book, Integer> {

}
