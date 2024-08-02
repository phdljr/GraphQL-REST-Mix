package me.phdljr.graphqlrestjpa.repository;

import me.phdljr.graphqlrestjpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
