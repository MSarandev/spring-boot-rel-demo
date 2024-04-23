package com.sudorambles.relationshipdemo.mappers;

import com.sudorambles.relationshipdemo.controllers.dto.LibraryDTO;
import com.sudorambles.relationshipdemo.repository.models.Library;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring",
        uses = {BookMapper.class}
)
public interface LibraryMapper {
    @Mapping(target = "createdAt", dateFormat = "yyyy-MM-dd HH:mm:ss")
    @Mapping(target = "updatedAt", dateFormat = "yyyy-MM-dd HH:mm:ss")
    LibraryDTO toDTO(Library library);

    Library fromDTO(LibraryDTO libraryDTO);
}
