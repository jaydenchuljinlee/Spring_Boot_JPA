package com.example.jpaTest;

import com.example.jpaTest.domain.Book;
import com.example.jpaTest.domain.BookStore;
import com.example.jpaTest.repository.BookRepository;
import com.example.jpaTest.repository.BookStoreRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@RunWith(SpringRunner.class)
@DataJpaTest
public class BookRegisterTest {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookStoreRepository bookStoreRepository;

    @Test
    public void 책_연관관계_매핑_테스트() {

        BookStore bookStore = new BookStore();

        bookStore.setName("책방");
        bookStoreRepository.save(bookStore);

        Book book = new Book();

        book.setTitle("스프링 강좌");
        bookStore.add(book);

        bookRepository.save(book);

        bookRepository.findAll();
    }
}
