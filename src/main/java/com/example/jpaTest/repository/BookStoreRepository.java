package com.example.jpaTest.repository;

import com.example.jpaTest.domain.BookStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookStoreRepository extends JpaRepository<BookStore,Long> {
}
