package com.sudorambles.relationshipdemo.repository;

import com.sudorambles.relationshipdemo.repository.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
