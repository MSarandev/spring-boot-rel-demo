package com.sudorambles.relationshipdemo.repository;

import com.sudorambles.relationshipdemo.repository.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
