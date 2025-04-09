package it.ifoa.progettoblog.Repositories;

import org.springframework.data.repository.CrudRepository;
import it.ifoa.progettoblog.models.Comment;

public interface CommentRepository extends CrudRepository<Comment,Long> {
    // Custom query methods can be defined here if needed
}

