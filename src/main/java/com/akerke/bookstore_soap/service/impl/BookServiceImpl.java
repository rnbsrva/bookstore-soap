package com.akerke.bookstore_soap.service.impl;

import com.akerke.bookstore_soap.entity.BookEntity;
import com.akerke.bookstore_soap.mapper.BookMapper;
import com.akerke.bookstore_soap.repo.BookRepository;
import com.akerke.bookstore_soap.service.BookService;
import localhost._8080.books.SaveBookRequest;
import localhost._8080.books.UpdateBookRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public BookEntity save(SaveBookRequest request) {
        return bookRepository.save(bookMapper.toModel(request));
    }

    @Override
    public BookEntity getBookById(Integer id) {
        return bookRepository.findById(id).orElseThrow();
    }

    @Override
    public BookEntity updateBook(UpdateBookRequest book) {
        return null;
    }

    @Override
    public void deleteBook(Integer id) {
        BookEntity bookEntity = this.getBookById(id);
        bookRepository.delete(bookEntity);
    }
}
