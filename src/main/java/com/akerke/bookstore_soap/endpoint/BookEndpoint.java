package com.akerke.bookstore_soap.endpoint;

import com.akerke.bookstore_soap.entity.BookEntity;
import com.akerke.bookstore_soap.service.BookService;
import localhost._8080.books.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
@Component
@Slf4j
@RequiredArgsConstructor
public class BookEndpoint {

    private final BookService bookService;

    @PayloadRoot(namespace = "http://localhost:8080/books", localPart = "GetBookByIdRequest")
    @ResponsePayload
    public GetBookByIdResponse processGetBookRequest(@RequestPayload GetBookByIdRequest getBookByIdRequest) {
        BookEntity bookEntity = bookService.getBookById(getBookByIdRequest.getId());
        GetBookByIdResponse getBookByIdResponse = new GetBookByIdResponse();
        Book book = new Book();
        BeanUtils.copyProperties(bookEntity, book);
        getBookByIdResponse.setBook(book);
        return getBookByIdResponse;
    }

    @PayloadRoot(namespace = "http://localhost:8080/books", localPart = "DeleteBookByIdRequest")
    @ResponsePayload
    public DeleteBookByIdResponse processDeleteBookRequest(@RequestPayload DeleteBookByIdRequest deleteBookByIdRequest) {
        BookEntity bookEntity = bookService.getBookById(getBookByIdRequest.getId());
        Book book = new Book();
        BeanUtils.copyProperties(bookEntity, book);
        getBookByIdResponse.setBook(book);
        return getBookByIdResponse;
    }




}
