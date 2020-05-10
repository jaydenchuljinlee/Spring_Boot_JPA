package com.example.jpaTest.repository;

import com.example.jpaTest.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository<T extends Item> extends JpaRepository<Item,Long> {

}
