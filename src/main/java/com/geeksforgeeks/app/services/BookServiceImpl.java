package com.geeksforgeeks.app.services;

import java.util.List;
import java.util.stream.Collectors;

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

	@Override
	public Book createBook(Book book) {
		return this.bookRepository.save(book);
	}

	@Override
	public List<Book> saveAll(List<Book> books) {
		return this.bookRepository.saveAll(books);
	}

	@Override
	public List<Book> saveAllStream(List<Book> books) {
		return this.saveParllel(books);
	}

	public List<Book> saveParllel(List<Book> books) {
		return books.parallelStream().map(book -> {
			this.bookRepository.save(book);
			return book;
		}).collect(Collectors.toList());
	}

	public void savWithThread(List<Book> books) {
		Thread t = new Thread(() -> {
			books.forEach(book -> {
				this.bookRepository.save(book);
			});
		});
	}
}
