package it.ifoa.progettoblog.Repositories;

import java.util.*;
import org.springframework.data.repository.ListCrudRepository;
import it.ifoa.progettoblog.models.Author;

public interface AuthorRepository extends ListCrudRepository<Author, Long> {
    //derived query
    List<Author> findByFirstName(String firstName);

    List<Author> findByLastName(String lastName);

    List<Author> findByFirstNameAndLastName(String firstName, String lastName);

    List<Author> findByEmail(String email);
    
}

    
