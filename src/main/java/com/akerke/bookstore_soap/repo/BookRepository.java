package com.akerke.bookstore_soap.repo;

import com.akerke.bookstore_soap.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Integer> {

}
