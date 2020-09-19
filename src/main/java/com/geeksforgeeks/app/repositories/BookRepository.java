package com.geeksforgeeks.app.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.geeksforgeeks.app.models.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {
	
}
