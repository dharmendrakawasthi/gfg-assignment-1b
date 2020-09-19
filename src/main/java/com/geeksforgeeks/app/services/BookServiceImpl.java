package com.geeksforgeeks.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geeksforgeeks.app.models.Book;
import com.geeksforgeeks.app.repositories.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public List<Book> getBooks() {
		return this.bookRepository.findAll();
	}

}
