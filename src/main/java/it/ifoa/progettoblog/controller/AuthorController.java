package it.ifoa.progettoblog.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.ifoa.progettoblog.Repositories.AuthorRepository;
import it.ifoa.progettoblog.models.Author;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired 
    private AuthorRepository authorRepository;

    // @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    //public @ResponseBody List<Author> getAllAuthors(){
    public List<Author> getAllAuthors(){
        //perchè se usiamo @restcontroller non abbiamo bisogno di @ResponseBody
        return authorRepository.findAll();
    }

    // @RequestMapping(value="/{id}", method = RequestMethod.POST)
    @GetMapping("/{id}")
    public @ResponseBody Author geAuthor(@PathVariable("id") Long id){
        return authorRepository.findById(id).get();
    }

    @PostMapping
    public Author saveAuthor(@RequestBody Author author){
        return authorRepository.save(author);
    }

    @PutMapping("/{id}")
    public Author updateAuthor(@PathVariable("id") Long id, @RequestBody Author author){
       author.setId(id);
       return authorRepository.save(author);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable("id") Long id){
        if(authorRepository.existsById(id)) {
            Author author = authorRepository.findById(id).get();
            authorRepository.delete(author);
        } else {
            System.out.println("Author with id " + id + " does not exist.");
        }
    }
}