package com.example.jpaTest;

import com.example.jpaTest.domain.Album;
import com.example.jpaTest.domain.Movie;
import com.example.jpaTest.repository.ItemRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
public class AdvencedMappingTest {

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private EntityManager entityManager;

    @Before
    public void setUp() {

        Movie movie = Movie.builder()
                    .actor("jin")
                    .director("iron")
                    .name("jin")
                    .price(10000)
                    .build();

        Album album = Album.builder()
                    .artist("john")
                    .name("neo")
                    .price(20000)
                    .build();

        itemRepository.save(movie);
        itemRepository.save(album);

        entityManager.clear();

    }

    @Test
    public void 상속_객체_테스트() {

        Movie movie = (Movie) itemRepository.findAll().get(0);
        Album album = (Album) itemRepository.findAll().get(1);

        assertThat(movie.getName()).isEqualTo("jin");
        assertThat(album.getArtist()).isEqualTo("john");

    }
}
