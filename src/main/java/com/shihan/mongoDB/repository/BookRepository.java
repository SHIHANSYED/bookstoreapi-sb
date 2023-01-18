package com.shihan.mongoDB.repository;

import com.shihan.mongoDB.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository <Book, Integer>{
}
