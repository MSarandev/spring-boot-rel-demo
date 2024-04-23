package com.sudorambles.relationshipdemo.mappers;

import com.sudorambles.relationshipdemo.controllers.dto.AuthorDTO;
import com.sudorambles.relationshipdemo.repository.models.Author;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring",
        uses = {BookMapper.class}
)
public interface AuthorMapper {
    @Mapping(target = "createdAt", dateFormat = "yyyy-MM-dd HH:mm:ss")
    @Mapping(target = "updatedAt", dateFormat = "yyyy-MM-dd HH:mm:ss")
    AuthorDTO toDTO(Author author);

    Author fromDTO(AuthorDTO authorDTO);
}
