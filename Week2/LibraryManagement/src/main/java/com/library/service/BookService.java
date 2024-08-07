package com.library.service;

import org.springframework.stereotype.Service;
import com.library.repository.BookRepository;

@Service 
public class BookService {
    private BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // Setter method for BookRepository
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void printServiceInfo() {
        System.out.println("BookService is operational.");
        bookRepository.printRepositoryInfo();
    }
}

