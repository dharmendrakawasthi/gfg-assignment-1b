package com.geeksforgeeks.app.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.geeksforgeeks.app.models.Book;

public interface BookRepository extends MongoRepository<Book, ObjectId> {
	
}
