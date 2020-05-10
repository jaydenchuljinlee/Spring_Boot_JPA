package com.example.jpaTest.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/*
* @Inheritance : JOINED 조인전략
*              : SINGLE_TABLE 단일 테이블 전략
*              : TABLE_PER_CLASS 클래스마다 테이블 생성 전략
* */
@Inheritance(strategy = InheritanceType.JOINED)//현재는 조인 테이블 전략
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DiscriminatorColumn(name = "type")//상속받은 클래스의 이름
@Entity @Getter
public abstract class Item {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
