package com.akerke.bookstore_soap.mapper;

import com.akerke.bookstore_soap.entity.BookEntity;
import localhost._8080.books.SaveBookRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface BookMapper {

    BookEntity toModel (SaveBookRequest request);

    void update (BookEntity oldBook, @MappingTarget BookEntity bookEntity);

}
