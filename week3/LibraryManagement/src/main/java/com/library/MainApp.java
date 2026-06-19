package com.library;
import com.library.repository.BookRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.Service;
public class MainApp {
public static void main(String[]args){
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    Service service = context.getBean("service", Service.class);
    service.displayRepository();
    BookRepository book = context.getBean("bookRepository", BookRepository.class);
    book.bookRepo();
}
}
