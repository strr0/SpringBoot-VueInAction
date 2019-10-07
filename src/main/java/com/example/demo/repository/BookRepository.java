package com.example.demo.repository;

import com.example.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(path = "bs", collectionResourceRel = "bs", itemResourceRel = "b")
public interface BookRepository extends JpaRepository<Book, Integer> {
    @RestResource(path = "author", rel = "author")
    List<Book> findByAuthorContains(@Param("author") String author);
    @RestResource(path = "name", rel = "name")
    Book findByName(@Param("name") String name);
}
