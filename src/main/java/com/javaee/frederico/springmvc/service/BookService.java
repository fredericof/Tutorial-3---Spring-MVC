package com.javaee.frederico.springmvc.service;

import java.util.Set;

import com.javaee.frederico.springmvc.domain.Book;

public interface BookService {

	Set<Book> getBooks();

    Book findById(Long id);

    Book saveBook(Book book);

    void deleteById(Long idToDelete);
    
}
