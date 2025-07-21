package com.practica.library.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.practica.library.model.Book;
import com.practica.library.model.BookDTO;
import com.practica.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class BookService {

    Logger logger = Logger.getLogger("BookService");
    private final BookRepository bookRepository;
    private final ObjectMapper mapper;


    public BookService(BookRepository bookRepository, ObjectMapper mapper) {

        this.bookRepository = bookRepository;
        this.mapper = mapper;
    }

    public void addBook(Book book){
        bookRepository.addBook(book);
    }

    public boolean deleteBook(Long id){
        return bookRepository.deleteBook(id);
    }

    public boolean updateBook(Long id, BookDTO book){
        return bookRepository.updateBook(id,mapper.convertValue(book,Book.class));
    }


}
