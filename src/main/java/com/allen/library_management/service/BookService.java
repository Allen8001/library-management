package com.allen.library_management.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    public List<String> getBooks() {
        return List.of(
                "Clean Code",
                "Effective Java",
                "Spring in Action"
        );
    }
}