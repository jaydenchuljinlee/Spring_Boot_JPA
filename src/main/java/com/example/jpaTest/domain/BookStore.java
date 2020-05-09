package com.example.jpaTest.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter @Setter
@Entity
public class BookStore {

    @Column(name = "id")
    @Id @GeneratedValue
    private int id;

    private String name;

    @OneToMany(mappedBy = "bookStore")
    private Set<Book> books = new HashSet<>();

    public void add(Book book) {
        //System.out.println(this);
        book.setBookStore(this);
        getBooks().add(book);
    }
}
