package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public void someRepositoryMethod() {
        System.out.println("BookRepository method executed.");
    }
}
