package com.akerke.bookstore_soap.service;

import com.akerke.bookstore_soap.entity.BookEntity;
import localhost._8080.books.SaveBookRequest;
import localhost._8080.books.UpdateBookRequest;

public interface BookService {

    BookEntity save(SaveBookRequest request);

    BookEntity getBookById(Integer id);

    BookEntity updateBook(UpdateBookRequest request);

    void deleteBook(Integer id);

}
