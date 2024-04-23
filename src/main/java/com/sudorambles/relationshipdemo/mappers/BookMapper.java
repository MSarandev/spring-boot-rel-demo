package com.sudorambles.relationshipdemo.mappers;

import com.sudorambles.relationshipdemo.controllers.dto.BookDTO;
import com.sudorambles.relationshipdemo.repository.models.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BookMapper {
    @Mapping(target = "createdAt", dateFormat = "yyyy-MM-dd HH:mm:ss")
    @Mapping(target = "updatedAt", dateFormat = "yyyy-MM-dd HH:mm:ss")
    BookDTO toDTO(Book book);

    @Mapping(target = "createdAt", dateFormat = "yyyy-MM-dd HH:mm:ss")
    @Mapping(target = "updatedAt", dateFormat = "yyyy-MM-dd HH:mm:ss")
    Book fromDTO(BookDTO bookDTO);
}
