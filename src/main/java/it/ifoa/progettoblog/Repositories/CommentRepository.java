package it.ifoa.progettoblog.Repositories;

import org.springframework.data.repository.ListCrudRepository;

import it.ifoa.progettoblog.models.Comment;

public interface CommentRepository extends ListCrudRepository<Comment,Long> {
    // Custom query methods can be defined here if needed
}

