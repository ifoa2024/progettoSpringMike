package it.ifoa.progettoblog.Repositories;

import org.springframework.data.repository.CrudRepository;
import it.ifoa.progettoblog.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
    // Custom query methods can be defined here if needed

}
