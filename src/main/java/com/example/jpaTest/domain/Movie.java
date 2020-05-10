package com.example.jpaTest.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity @Getter
@DiscriminatorValue("Movie")//슈퍼 클래스의 type에 들어갈 클래스의 이름
public class Movie extends Item{

    private String actor;

    private String director;

    @Builder
    public Movie(String name,int price,String actor, String director) {
        super(name,price);
        this.actor = actor;
        this.director = director;
    }
}
