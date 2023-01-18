package com.shihan.mongoDB.resources;


import com.shihan.mongoDB.model.Book;
import com.shihan.mongoDB.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    private BookRepository repository;
@PostMapping("/addbook")
    public String saveBook(@RequestBody Book book){
    repository.save(book);
    return "Added book with id"+ book.getId();

    }
@GetMapping("/findallbooks")
    public List<Book> getBooks(){
    return repository.findAll();
    }
    @GetMapping("/findabook/{id}")
    public Optional<Book> getBook(@PathVariable int id){
    return repository.findById(id);
    }
    @DeleteMapping("/deleteabook/{id}")
    public void deleteBook(@PathVariable int id){
    repository.deleteById(id);
    }
}
