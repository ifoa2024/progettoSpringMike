package it.ifoa.progettoblog.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import it.ifoa.progettoblog.Repositories.AuthorRepository;
import it.ifoa.progettoblog.models.Author;

@Controller
public class AuthorController {

    @Autowired 
    private AuthorRepository authorRepository;

    @RequestMapping(value = "/authors", method = RequestMethod.GET)
    public @ResponseBody List<Author> getAllAuthors(){
        return authorRepository.findAll();
    }
}
