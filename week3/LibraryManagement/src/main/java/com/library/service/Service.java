package com.library.service;
import com.library.repository.*;
public class Service {
    BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayRepository() {
        System.out.println("Displaying repo....");
        bookRepository.bookRepo();
    }
}
