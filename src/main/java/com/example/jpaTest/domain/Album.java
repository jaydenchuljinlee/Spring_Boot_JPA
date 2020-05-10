package com.example.jpaTest.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity @Getter
@DiscriminatorValue("Album")//슈퍼 클래스의 type에 들어갈 클래스의 이름
public class Album extends Item{

    private String artist;

    @Builder
    public Album(String name,int price,String artist) {
        super(name,price);
        this.artist = artist;
    }
}
