package com.example.jpaTest.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
public class Book {

    @Column(name = "id")
    @Id @GeneratedValue
    private int id;

    private long isbn;

    private String title;

    private String content;

    @ManyToOne
    private BookStore bookStore;
}
