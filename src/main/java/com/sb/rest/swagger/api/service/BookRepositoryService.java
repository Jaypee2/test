package com.sb.rest.swagger.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.rest.swagger.api.dao.BookRepositoryDao;
import com.sb.rest.swagger.api.model.Book;

@Service
public class BookRepositoryService {

	@Autowired
	private BookRepositoryDao bookDao;

	public String saveBook(Book book) {
		bookDao.save(book);
		return "book saved with bookId " + book.bookId;

	}

	public Book getBook(int bookId) {
		return bookDao.findOne(bookId);

	}

	public List<Book> removeBook(int bookId) {
		bookDao.delete(bookId);
		return bookDao.findAll();
	}

}
