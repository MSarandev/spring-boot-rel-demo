package com.sudorambles.relationshipdemo.controllers;

import com.sudorambles.relationshipdemo.controllers.dto.AuthorDTO;
import com.sudorambles.relationshipdemo.controllers.dto.BookDTO;
import com.sudorambles.relationshipdemo.controllers.dto.LibraryDTO;
import com.sudorambles.relationshipdemo.mappers.AuthorMapper;
import com.sudorambles.relationshipdemo.mappers.BookMapper;
import com.sudorambles.relationshipdemo.mappers.LibraryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sudorambles.relationshipdemo.repository.AuthorRepository;
import com.sudorambles.relationshipdemo.repository.BookRepository;
import com.sudorambles.relationshipdemo.repository.LibraryRepository;
import com.sudorambles.relationshipdemo.repository.models.Author;
import com.sudorambles.relationshipdemo.repository.models.Book;
import com.sudorambles.relationshipdemo.repository.models.Library;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LibraryController {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final LibraryRepository libraryRepository;

    private final BookMapper bookMapper;
    private final AuthorMapper authorMapper;
    private final LibraryMapper libraryMapper;

    @PostMapping("/books")
    public BookDTO createBook(
            @RequestBody Book book
    ) {
        return bookMapper.toDTO(bookRepository.save(book));
    }

    @GetMapping("/books")
    public List<BookDTO> getBooks() {
        return bookRepository.findAll()
                .stream()
                .map(bookMapper::toDTO)
                .toList();
    }

    @PostMapping("/authors")
    public AuthorDTO createAuthor(
            @RequestBody Author author
    ) {
        return authorMapper.toDTO(authorRepository.save(author));
    }

    @GetMapping("/authors")
    public List<AuthorDTO> getAuthors() {
        return authorRepository.findAll()
                .stream()
                .map(authorMapper::toDTO)
                .toList();
    }

    @PostMapping("/libraries")
    public LibraryDTO createLibrary(
            @RequestBody Library library
    ) {
        return libraryMapper.toDTO(libraryRepository.save(library));
    }

    @GetMapping("/libraries")
    public List<LibraryDTO> getLibraries() {
        return libraryRepository.findAll()
                .stream()
                .map(libraryMapper::toDTO)
                .toList();
    }
}
