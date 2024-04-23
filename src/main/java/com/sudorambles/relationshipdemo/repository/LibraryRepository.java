package com.sudorambles.relationshipdemo.repository;

import com.sudorambles.relationshipdemo.repository.models.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Integer> {
}
