package com.sudorambles.relationshipdemo.repository.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "libraries", schema = "relDemo")
public class Library {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "is_open")
    private boolean isOpen;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @OneToMany(mappedBy = "library", fetch = FetchType.LAZY)
    private List<Book> books;
}
