package com.library.service;
import com.library.repository.BookRepository;
public class Service {
    BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    public void BookService(){
        System.out.print("Booking Service....");
        bookRepository.bookMyRepo();
    }
}
