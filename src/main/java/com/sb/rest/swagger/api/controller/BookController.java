package com.sb.rest.swagger.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.rest.swagger.api.model.Book;
import com.sb.rest.swagger.api.service.BookRepositoryService;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookRepositoryService service;

	@PostMapping("/save")
	public String saveBook(@RequestBody Book book) {
		return service.saveBook(book);

	}

	@GetMapping("/searchBook/{bookId}")
	public Book getBook(@PathVariable int bookId) {
		return service.getBook(bookId);

	}

	@DeleteMapping("/deleteBook/{bookId}")
	public List<Book> deleteBook(@PathVariable int bookId) {
		return service.removeBook(bookId);

	}

}
