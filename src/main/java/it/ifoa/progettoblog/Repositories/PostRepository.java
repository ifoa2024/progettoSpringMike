package it.ifoa.progettoblog.Repositories;

import java.util.List;

import org.springframework.data.repository.ListCrudRepository;

import it.ifoa.progettoblog.models.Post;

public interface PostRepository extends ListCrudRepository<Post, Long> {
    // Custom query methods can be defined here if needed

    List<Post> findByTitle(String title);
}
