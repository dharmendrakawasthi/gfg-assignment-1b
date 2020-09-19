package com.geeksforgeeks.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geeksforgeeks.app.models.Book;
import com.geeksforgeeks.app.services.BookService;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/allBooks")
	public ResponseEntity<List<Book>> getAllBooks() {
		return new ResponseEntity(this.bookService.getBooks(), HttpStatus.FOUND);
	}
}
