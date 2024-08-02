package me.phdljr.graphqlrestjpa.controller;

import lombok.RequiredArgsConstructor;
import me.phdljr.graphqlrestjpa.entity.Author;
import me.phdljr.graphqlrestjpa.entity.Book;
import me.phdljr.graphqlrestjpa.repository.AuthorRepository;
import me.phdljr.graphqlrestjpa.repository.BookRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class HelloGraphController {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    @QueryMapping
    public Book bookById(@Argument Long id) {
        return bookRepository.findById(id).orElseThrow();
    }

    @SchemaMapping
    public Author author(Book book) {
        return authorRepository.findById(book.getId()).orElseThrow();
    }
}
