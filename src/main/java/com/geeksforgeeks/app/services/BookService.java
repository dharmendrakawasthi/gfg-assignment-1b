package com.geeksforgeeks.app.services;

import java.util.List;

import com.geeksforgeeks.app.models.Book;

public interface BookService {
	
	public List<Book> getBooks();
	public Book createBook(Book book);
	public List<Book> saveAll(List<Book> books);
	public List<Book> saveAllStream(List<Book> books);
	public void savWithThread(List<Book> books);
}
