package com.sudorambles.relationshipdemo.controllers.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class LibraryDTO {
    private int id;

    private String cityName;

    private List<BookDTO> books;

    private String createdAt;

    private String updatedAt;
}
