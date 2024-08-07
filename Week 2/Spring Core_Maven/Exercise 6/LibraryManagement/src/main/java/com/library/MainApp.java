package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Load the Spring context from the XML configuration file
        ApplicationContext context = new AnnotationConfigApplicationContext("com.library");

        // Retrieve the BookService bean from the Spring context
        BookService bookService = context.getBean(BookService.class);

        // Test the configuration
        bookService.displayService();
    }
}
