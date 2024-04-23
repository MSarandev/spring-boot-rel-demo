package com.sudorambles.relationshipdemo.controllers.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class BookDTO {
    private int id;

    private String title;

    private Date createdAt;

    private Date updatedAt;
}
