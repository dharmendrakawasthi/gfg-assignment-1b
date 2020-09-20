package com.geeksforgeeks.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@PostMapping("/create")
	public ResponseEntity<Book> addBook(@RequestBody Book book) {
		return new ResponseEntity(this.bookService.createBook(book), HttpStatus.CREATED);
	}
	
	@PostMapping("/createAll")
	public ResponseEntity<List<Book>> saveMany(@RequestBody List<Book> books) {
		return new ResponseEntity(this.bookService.saveAll(books), HttpStatus.CREATED);
	}
	
	@PostMapping("/createStreams")
	public ResponseEntity<List<Book>> saveManyStreams(@RequestBody List<Book> books) {
		return new ResponseEntity(this.bookService.saveAllStream(books), HttpStatus.CREATED);
	}
	
	@PostMapping("/createAllThreads")
	public ResponseEntity<HttpStatus> saveManyTheads(@RequestBody List<Book> books) {
		this.bookService.savWithThread(books);
		return new ResponseEntity(HttpStatus.CREATED); 
	}
}
