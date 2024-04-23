package com.sudorambles.relationshipdemo.controllers.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class AuthorDTO {
    private int id;

    private String firstName;

    private String lastName;

    private List<BookDTO> books;

    private String createdAt;

    private String updatedAt;
}
