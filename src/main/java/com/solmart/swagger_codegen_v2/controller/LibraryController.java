package com.solmart.swagger_codegen_v2.controller;

import com.solmart.swagger_codegen_v2.api.LibraryApi;
import com.solmart.swagger_codegen_v2.models.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LibraryController implements LibraryApi {

    @Override
    public ResponseEntity<List<Book>> getAllBooksInLibrary() {
        List<Book> list=new ArrayList<>();
        Book book=new Book();
        book.setName("OneBook");
        book.setAuthor("OneAuthor");
        list.add(book);

        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
